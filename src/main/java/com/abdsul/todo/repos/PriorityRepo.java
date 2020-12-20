package com.abdsul.todo.repos;

import com.abdsul.todo.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepo extends JpaRepository<Priority, Long> {
}
