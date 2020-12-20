package com.abdsul.todo.repos;

import com.abdsul.todo.model.Category;
import com.abdsul.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {
    List<Task> findByCategory(Category currentCategory);
}
