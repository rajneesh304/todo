package com.rajneesh304.todoapi.model.dto;

import com.rajneesh304.todoapi.enums.Status;
import lombok.*;

import java.util.UUID;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private UUID id;
    private String text;
    private Status status;
}
