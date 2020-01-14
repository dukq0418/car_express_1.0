package com.dkq.service;

import com.dkq.entity.User;

public interface UserService {

    User queryByUser(String tel, String password);

    Integer register(User user);

    Integer update(User user);

    User denglu(Integer uid);
}
