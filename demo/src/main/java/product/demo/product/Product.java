package product.demo.product;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Product {

    public Product(){

    }

    public Product(String id, String name, ArrayList<String> groupId, double amount, double sellingPrice, double purchasePrice) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
        this.amount = amount;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
    }

    private String id;
    private String name;
    private ArrayList<String> groupId;
    private double amount;
    private double sellingPrice;
    private double purchasePrice;

}
