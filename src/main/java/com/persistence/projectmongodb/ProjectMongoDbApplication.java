package com.persistence.projectmongodb;

import com.persistence.projectmongodb.entity.Address;
import com.persistence.projectmongodb.entity.Consumer;
import com.persistence.projectmongodb.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = OrderRepository.class)
public class ProjectMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMongoDbApplication.class, args);
	}
}
