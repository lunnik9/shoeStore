package com.example.orderapi.order;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
public class Order {
    public Order(){

    }

    public Order(String id, String userId, ArrayList<String> products, LocalDate createdOn) {
        this.id = id;
        this.userId = userId;
        this.products = products;
        this.createdOn = createdOn;
    }

    private String id;
    private String userId;
    private ArrayList<String> products;
    private LocalDate createdOn;
}
