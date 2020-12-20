package com.abdsul.todo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="priority_tbl")
@Setter
@Getter
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long priority_id;

    private String title;

    private String color;


}
