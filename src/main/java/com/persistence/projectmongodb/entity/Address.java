package com.persistence.projectmongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Address {

    @Id
    private Long id;
    private String road;
    private String city;

    @Override
    public String toString() {
        return road + " - cidade: " + city;
    }

    public Address() {
        super();
    }
    public Address(String road, String city) {
        super();
        this.road = road;
        this.city = city;
    }

}
