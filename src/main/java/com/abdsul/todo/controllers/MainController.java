package com.abdsul.todo.controllers;

import com.abdsul.todo.model.Category;
import com.abdsul.todo.model.Priority;
import com.abdsul.todo.model.Task;
import com.abdsul.todo.model.User;
import com.abdsul.todo.services.CategoryService;
import com.abdsul.todo.services.PriorityService;
import com.abdsul.todo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin()
@RestController
@RequestMapping("/todo-list")
public class MainController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    TaskService taskService;

    @Autowired
    PriorityService priorityService;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getTasks(){
        List<Task> tasks = taskService.findAll();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategories(){
        List<Category> categories = categoryService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<List<Task>> getTasksByCategory(
            @PathVariable Long id
    ){
        Category currentCategory = categoryService.findById(id);
        List<Task> tasks = taskService.findByCategory(currentCategory);
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping("/tasks")
    public ResponseEntity<Map<String, String>> addTask(@RequestBody Task task){
        taskService.save(task);
        Map<String, String> map = new HashMap<>();
        map.put("message", "Задача добавлена в список");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<List<Task>> deleteTask(
            @PathVariable Long id
    ){
        Task task  = taskService.findTaskById(id);
        taskService.delete(task);
        return getTasks();
    }

    @GetMapping("/priorities")
    public ResponseEntity<List<Priority>> getPriorities(){
        List<Priority> priorities = priorityService.findAll();
        return new ResponseEntity<>(priorities, HttpStatus.OK);
    }

    @GetMapping("/validateLogin" )
    public ResponseEntity<User> validateLogin() {
        return new ResponseEntity<>(new User("User successfully authenticated"), HttpStatus.OK) ;
    }


}
