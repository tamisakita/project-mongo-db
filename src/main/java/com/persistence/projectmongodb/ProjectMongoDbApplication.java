package com.persistence.projectmongodb;

import com.persistence.projectmongodb.entity.Address;
import com.persistence.projectmongodb.entity.Consumer;
import com.persistence.projectmongodb.entity.Order;
import com.persistence.projectmongodb.entity.Product;
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
public class ProjectMongoDbApplication implements CommandLineRunner{

	@Autowired
	public OrderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		Address home = new Address("Rua Paraiso", "São Paulo");
		Address work = new Address("Rua Joaquim", "Santo Andre");
		List<Address> addressList = new ArrayList<>();
		addressList.add(home);
		addressList.add(work);

		Product product = new Product("banana", 1, 5.50, 6);
		Product product2 = new Product("cebola", 2, 2.50, 5);
		List<Product> productList = new ArrayList<>();
		productList.add(product);
		productList.add(product2);

		repository.save(new Order(productList, new Consumer("Fernanda", addressList, "teste@teste.com", "1234-1234", "123456789")));


	}
}
