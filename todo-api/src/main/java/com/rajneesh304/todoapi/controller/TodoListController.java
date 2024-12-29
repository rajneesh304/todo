package com.rajneesh304.todoapi.controller;

import com.rajneesh304.todoapi.model.dto.TodoListDto;
import com.rajneesh304.todoapi.service.TodoListService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/todoList")
@RestController
public class TodoListController {
    @Autowired
    TodoListService todoListService;

    @GetMapping
    public List<TodoListDto> getTodoList() {
        return todoListService.getAllTodoList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoListDto addTodoList(@Valid @RequestBody TodoListDto todoListDto) {
        return todoListService.addTodoList(todoListDto);
    }
}
