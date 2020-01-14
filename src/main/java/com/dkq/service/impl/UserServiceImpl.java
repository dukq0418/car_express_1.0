package com.dkq.service.impl;

import com.dkq.entity.User;
import com.dkq.mapper.UserMapper;
import com.dkq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryByUser(String tel, String password) {
        return userMapper.queryByUser(tel,password);
    }

    @Override
    public Integer register(User user) {
        return userMapper.register(user);
    }

    @Override
    public Integer update(User user) {
        return userMapper.update(user);
    }

    @Override
    public User denglu(Integer uid) {
        return userMapper.denglu(uid);
    }
}
