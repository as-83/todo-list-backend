package com.abdsul.todo.services;

import com.abdsul.todo.model.Priority;

import java.util.List;

public interface PriorityService {
    List<Priority> findAll();
}
