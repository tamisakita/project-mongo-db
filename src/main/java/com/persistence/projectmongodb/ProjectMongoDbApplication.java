package com.persistence.projectmongodb;

import com.persistence.projectmongodb.entity.Address;
import com.persistence.projectmongodb.entity.Consumer;
import com.persistence.projectmongodb.entity.Order;
import com.persistence.projectmongodb.entity.Product;
import com.persistence.projectmongodb.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ConsumerRepository.class)
public class ProjectMongoDbApplication implements CommandLineRunner{

	@Autowired
	public ConsumerRepository repository;

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

		Product product3 = new Product("abacaxi", 1, 5.50, 6);
		Product product4 = new Product("chocolate", 2, 2.50, 5);
		List<Product> productList2 = new ArrayList<>();
		productList2.add(product3);
		productList2.add(product4);

		Order order = new Order(productList);
		Order order2 = new Order(productList2);

		List<Order> orderList = new ArrayList<>();
		orderList.add(order);
		orderList.add(order2);

		repository.save(new Consumer("Fernanda", addressList, "teste@teste.com", "1234-1234", "123456789", orderList));


	}
}
