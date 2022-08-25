package com.persistence.projectmongodb.service;

import com.persistence.projectmongodb.entity.Consumer;
import com.persistence.projectmongodb.entity.Order;
import com.persistence.projectmongodb.entity.Product;
import com.persistence.projectmongodb.repository.ConsumerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConsumerService {

    private final ConsumerRepository repository;

    public Optional<Consumer> findConsumer(String id) {
        return repository.findById(id);
    }

    public List<Consumer> findAllConsumers() {
        return repository.findAll();
    }

    public Consumer saveOrder(Consumer consumer) {
        return repository.save(consumer);
    }
}
