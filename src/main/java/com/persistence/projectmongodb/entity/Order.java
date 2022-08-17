package com.persistence.projectmongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class Order {

    @Id
    private Long id;

    private String name;

    private List<Product> product;

    private Consumer consumer;

    public Order(String nome, List<Product> product, Consumer consumer) {
        super();
        this.name = nome;
        this.product = product;
        this.consumer = consumer;
    }

}
