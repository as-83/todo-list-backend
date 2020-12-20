package com.abdsul.todo.services;

import com.abdsul.todo.model.Priority;
import com.abdsul.todo.repos.PriorityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityServiceImpl implements PriorityService{
    @Autowired
    private PriorityRepo priorityRepo;
    @Override
    public List<Priority> findAll() {
        return priorityRepo.findAll();
    }
}
