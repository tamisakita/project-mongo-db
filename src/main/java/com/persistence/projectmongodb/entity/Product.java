package com.persistence.projectmongodb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class Product {

    @Id
    private String product_id;

    private String name;
    private int inventory;
    private Double price;
    private Integer quantity;

    public Product(String name, int inventory, Double price, Integer quantity) {
        this.name = name;
        this.inventory = inventory;
        this.price = price;
        this.quantity = quantity;
    }

}
