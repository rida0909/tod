package com.todo.springboot.todoList.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.springboot.todoList.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
}
