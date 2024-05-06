package com.example.democrud.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.democrud.entity.User;
import com.example.democrud.service.UserService;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        int id = userService.saveUser(user);
        return ResponseEntity.created(URI.create(String.valueOf(id))).build();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody User user) {
        user.setId(id);
        userService.updateUser(user);
    }

    @GetMapping("/{id}")
    public User queryUser(@PathVariable Integer id) {
        return userService.queryUser(id);
    }

    @GetMapping
    public Page<User> queryUser(int pageNo, int pageSize, User user) {
        return userService.pageQuery(pageNo, pageSize, user);
    }

}
