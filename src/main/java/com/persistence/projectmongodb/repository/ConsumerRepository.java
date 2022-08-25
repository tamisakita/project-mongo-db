package com.persistence.projectmongodb.repository;

import com.persistence.projectmongodb.entity.Consumer;
import com.persistence.projectmongodb.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ConsumerRepository extends MongoRepository<Consumer, String> {

}
