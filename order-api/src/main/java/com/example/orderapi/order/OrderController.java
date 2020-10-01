package com.example.orderapi.order;


import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/order/info")
public class OrderController {

    @GetMapping("/{orderId}")
    public Order getProductById(@PathVariable("orderId") String orderId){
        return new Order(orderId,"userId", new ArrayList<String>(), LocalDate.now());
    }
}
