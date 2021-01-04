package com.abdsul.todo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private  String status;

    public User(){}

    public User(String status){
        this.status = status;
    }
}
