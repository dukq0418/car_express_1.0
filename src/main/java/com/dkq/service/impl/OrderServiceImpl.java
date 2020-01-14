package com.dkq.service.impl;

import com.dkq.entity.Car;
import com.dkq.entity.Order;
import com.dkq.entity.User;
import com.dkq.mapper.CarMapper;
import com.dkq.mapper.OrderMapper;
import com.dkq.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Integer add(Integer uid,Integer getid,Integer backid,Double oprice,Integer cid,String ostatus) {
        return orderMapper.add(uid, getid, backid, oprice, cid, ostatus);
    }

    @Override
    public List<Order> all(Integer uid) {
        return orderMapper.all(uid);
    }

    @Override
    public Integer delete(String id) {
        return orderMapper.delete(id);
    }
}
