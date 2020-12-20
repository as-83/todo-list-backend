package com.abdsul.todo.services;

import com.abdsul.todo.model.Category;
import com.abdsul.todo.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();

    List<Task> findByCategory(Category currentCategory);

    void save(Task task);

    Task findTaskById(Long id);

    void delete(Task task);
}
