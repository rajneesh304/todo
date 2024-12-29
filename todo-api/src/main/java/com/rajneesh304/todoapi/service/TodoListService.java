package com.rajneesh304.todoapi.service;

import com.rajneesh304.todoapi.model.dto.TodoListDto;
import com.rajneesh304.todoapi.model.entity.TodoList;

import java.util.List;
import java.util.UUID;

public interface TodoListService {
    List<TodoListDto> getAllTodoList();
    TodoList getTodoListById(UUID id);
    void deleteTodoListById(UUID id);
    TodoListDto addTodoList(TodoListDto todoListDto);
    void updateTodoList(TodoList todoList);
}