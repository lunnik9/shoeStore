package com.example.userapi.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/user/info")
public class UserController {

    @GetMapping("/{userId}")
    public User getProductById(@PathVariable("userId") String userId){
        return new User("name","password",userId);
    }
}
