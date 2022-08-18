package com.persistence.projectmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Consumer {

    private String name;
    private List<Address> address;
    private String email;
    private String phone;
    private String cpf;

}
