package com.rajneesh304.todoapi.service;

import com.rajneesh304.todoapi.model.dto.TodoDto;

import java.util.List;

public interface TodoService {
    public List<TodoDto> getAllTodos();
    public TodoDto getTodoById(int id);
    public void addTodo(TodoDto todo);
    public void updateTodo(TodoDto todo);
    public void deleteTodo(int id);
}
