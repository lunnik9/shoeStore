package com.example.groupapi.group;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group/info")
public class ProductController {

    @GetMapping("/{groupId}")
    public Group getProductById(@PathVariable("groupId") String groupId){
        return new Group(groupId,"name");
    }

}