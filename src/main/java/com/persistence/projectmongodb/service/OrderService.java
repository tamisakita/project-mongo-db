package com.persistence.projectmongodb.service;

import com.persistence.projectmongodb.entity.Order;
import com.persistence.projectmongodb.entity.Product;
import com.persistence.projectmongodb.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order saveOrder(Order order) {
        return repository.save(order);
    }

}
