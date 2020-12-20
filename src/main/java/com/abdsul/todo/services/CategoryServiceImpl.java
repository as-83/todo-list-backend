package com.abdsul.todo.services;

import com.abdsul.todo.model.Category;
import com.abdsul.todo.repos.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;


    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category findById(Long categoryId) {
        return categoryRepo.findById(categoryId).get();
    }


}
