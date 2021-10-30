package com.todo.springboot.todoList.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.todo.springboot.todoList.model.Todo;

public interface ITodoService {

	List<Todo> getTodosByUser();

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String name, String desc, Date targetDate, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}