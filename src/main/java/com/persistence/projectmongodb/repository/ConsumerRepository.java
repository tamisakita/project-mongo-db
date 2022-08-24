package com.persistence.projectmongodb.repository;

import com.persistence.projectmongodb.entity.Consumer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsumerRepository extends MongoRepository<Consumer, String> {

}
