package com.abdsul.todo.services;

import com.abdsul.todo.model.Category;
import com.abdsul.todo.model.Task;
import com.abdsul.todo.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepo taskRepo;


    @Override
    public List<Task> findAll() {
        return taskRepo.findAll();
    }

    @Override
    public List<Task> findByCategory(Category currentCategory) {
        return taskRepo.findByCategory(currentCategory);
    }

    @Override
    public void save(Task task) {
        taskRepo.save(task);
    }

    @Override
    public Task findTaskById(Long id) {
        return taskRepo.findById(id).get();
    }

    @Override
    public void delete(Task task) {
        taskRepo.delete(task);
    }
}
