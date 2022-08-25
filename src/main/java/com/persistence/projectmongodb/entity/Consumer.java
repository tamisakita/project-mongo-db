package com.persistence.projectmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Consumer {

    @Id
    private String id;

    private String name;

    private List<Address> address;

    @Indexed(unique = true)
    private String email;

    private String phone;

    @Indexed(unique = true)
    private String cpf;

    private List<Order> orders;

    public Consumer(String name, List<Address> address, String email, String phone, String cpf, List<Order> orders) {
        super();
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.cpf = cpf;
        this.orders = orders;
    }

    public Consumer() {

    }
}
