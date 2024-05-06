package com.example.democrud.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.democrud.entity.User;
import com.example.democrud.mapper.UserMapper;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User queryUser(Integer id) {
        return userMapper.selectById(id);
    }

    public int saveUser(User user) {
        return userMapper.insert(user);
    }

    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

    public void updateUser(User user) {
        userMapper.updateById(user);
    }

    public Page<User> pageQuery(int pageNo, int pageSize, User user) {
        QueryWrapper<User> query = Wrappers.query();
        if (user.getName() != null) query.like("name", user.getName());
        return userMapper.selectPage(new Page<>(pageNo, pageSize), query);
    }
}
