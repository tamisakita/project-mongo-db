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
    private Long id;

    private String name;

    private int inventory;

    private Double price;

    private List<Order> orders;

    public Product(String nome, int inventory, Double price, List<Order> orders) {
        super();
        this.name = nome;
        this.inventory = inventory;
        this.price = price;
        this.orders = orders;
    }
}
