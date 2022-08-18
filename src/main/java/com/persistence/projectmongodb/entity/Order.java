package com.persistence.projectmongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class Order {

    @Id
    private String id;

    private List<Product> product;

    private Consumer consumer;

    public Order(List<Product> product, Consumer consumer) {
        super();
        this.product = product;
        this.consumer = consumer;
    }

}
