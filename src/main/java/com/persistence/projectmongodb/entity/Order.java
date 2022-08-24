package com.persistence.projectmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class Order {

    @Id
    private String order_id;

    private List<Product> productList;

    public Order(List<Product> productList) {
        this.productList = productList;
    }


}
