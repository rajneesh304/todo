package com.rajneesh304.todoapi.model.dto;

import com.rajneesh304.todoapi.model.entity.Todo;
import com.rajneesh304.todoapi.model.entity.TodoList;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TodoListDto {
    private UUID id;
    @NotNull(message = "Title cannot be empty")
    private String title;
    private String description;
    private List<Todo> todos;
    @NotNull(message = "user is not logged in")
    private UUID userId;

    public TodoList toModel() {
        return TodoList.builder()
                .title(getTitle())
                .description(getDescription())
                .id(id)
                .todos(todos)
                .userId(userId)
                .build();
    }
}
