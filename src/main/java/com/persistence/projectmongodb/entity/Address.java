package com.persistence.projectmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class Address {

    private String street;
    private String city;

    @Override
    public String toString() {
        return street + " - cidade: " + city;
    }

}
