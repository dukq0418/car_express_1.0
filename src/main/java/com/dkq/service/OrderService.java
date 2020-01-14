package com.dkq.service;


import com.dkq.entity.Order;

import java.util.List;

public interface OrderService {

    Integer add(Integer uid,Integer getid,Integer backid,Double oprice,Integer cid,String ostatus);

    List<Order> all(Integer uid);

    Integer delete(String id);
}
