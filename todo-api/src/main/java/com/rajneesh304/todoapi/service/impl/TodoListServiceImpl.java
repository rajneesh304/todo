package com.rajneesh304.todoapi.service.impl;

import com.rajneesh304.todoapi.model.dto.TodoListDto;
import com.rajneesh304.todoapi.model.entity.TodoList;
import com.rajneesh304.todoapi.repository.TodoListRepository;
import com.rajneesh304.todoapi.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoListServiceImpl implements TodoListService {
    @Autowired
    TodoListRepository todoListRepository;

    @Override
    public List<TodoListDto> getAllTodoList() {
        return todoListRepository.findAll().stream().map(TodoList::toDto).toList();
    }

    @Override
    public TodoList getTodoListById(UUID id) {

        return todoListRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTodoListById(UUID id) {

    }

    @Override
    public TodoListDto addTodoList(TodoListDto todoListDto) {
        return todoListRepository.save(todoListDto.toModel()).toDto();
    }

    @Override
    public void updateTodoList(TodoList todoList) {

    }
}
