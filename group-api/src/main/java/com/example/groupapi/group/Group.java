package com.example.groupapi.group;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Group {

    public Group(){

    }

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;
}
