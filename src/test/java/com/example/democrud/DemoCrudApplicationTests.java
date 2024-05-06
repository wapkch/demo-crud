package com.example.democrud;

import com.example.democrud.entity.User;
import com.example.democrud.mapper.UserMapper;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@SpringBootTest
@Testcontainers
class DemoCrudApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Container
    @ServiceConnection
    static MySQLContainer<?> mySQLContainer = new MySQLContainer<>(DockerImageName.parse("mysql:8.0.34"));

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        Assertions.assertEquals(5, users.size());
    }

}
