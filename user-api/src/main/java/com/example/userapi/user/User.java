package com.example.userapi.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    public User(){

    }

    public User(String name, String password, String id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    private String name;
    private String password;
    private String id;

}
