package com.dkq.mapper;

import com.dkq.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User queryByUser(String tel, String password);

    Integer register(User user);

    Integer update(User user);

    User denglu(Integer uid);
}
