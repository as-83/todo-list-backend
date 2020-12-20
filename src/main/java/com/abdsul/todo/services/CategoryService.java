package com.abdsul.todo.services;

import com.abdsul.todo.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category findById(Long categoryId);
}
