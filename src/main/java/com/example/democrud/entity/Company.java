package com.example.democrud.entity;

import java.util.List;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Company {

	private Integer id;

    private String name;

    List<User> userList;

}
