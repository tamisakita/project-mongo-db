package com.persistence.projectmongodb.repository;

import com.persistence.projectmongodb.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {

}
