package com.rajneesh304.todoapi.repository;

import com.rajneesh304.todoapi.model.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, UUID> {
}
