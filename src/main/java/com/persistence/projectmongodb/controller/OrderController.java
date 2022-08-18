package com.persistence.projectmongodb.controller;

import com.persistence.projectmongodb.entity.Order;
import com.persistence.projectmongodb.entity.Product;
import com.persistence.projectmongodb.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
@AllArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @PostMapping("/order")
    public Order saveOrder(Order order) {
        return service.saveOrder(order);
    }

}
