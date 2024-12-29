package com.rajneesh304.todoapi.model.entity;

import com.rajneesh304.todoapi.model.dto.TodoListDto;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TODO_LIST")
@Builder
public class TodoList {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @UuidGenerator
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "todoList", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Todo> todos = new ArrayList<Todo>();

    @Column(name = "user_id")
    private UUID userId;

    public TodoListDto toDto(){
        return TodoListDto.builder()
        .id(id)
        .title(title)
        .description(description)
        .todos(todos)
        .userId(userId)
        .build();
    }
}
