package com.rajneesh304.todoapi.model.entity;

import com.rajneesh304.todoapi.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TODO")
@Builder
public class Todo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @UuidGenerator
    private UUID id;

    @Column(name = "text")
    private String text;

    @Column(name = "status")
    private Status status;
}
