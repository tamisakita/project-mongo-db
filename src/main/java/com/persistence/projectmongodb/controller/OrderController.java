package com.persistence.projectmongodb.controller;

import com.persistence.projectmongodb.entity.Consumer;
import com.persistence.projectmongodb.entity.Order;
import com.persistence.projectmongodb.entity.Product;
import com.persistence.projectmongodb.service.ConsumerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consumer")
@AllArgsConstructor
public class OrderController {

    private final ConsumerService service;

    @GetMapping("/{id}")
    public Optional<Consumer> getAllOrders(@PathVariable String id) {
        return service.findConsumer(id);
    }

    @GetMapping("/")
    public List<Consumer> getAllConsumers() {
        return service.findAllConsumers();
    }

    @PostMapping("/")
    public Consumer saveOrderByConsumer(@RequestBody Consumer consumer) {
        return service.saveOrder(consumer);
    }

}
