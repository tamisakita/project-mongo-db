package com.persistence.projectmongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class Consumer {

    @Id
    private Long id;
    private String name;
    private List<Address> address;

    public Consumer() {}

    public Consumer(String name) {
        this.name = name;
    }

    public Consumer(String nome, List<Address> address) {
        super();
        this.name = nome;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - Nome: " + name + "\nEndereco: " + address;
    }

}
