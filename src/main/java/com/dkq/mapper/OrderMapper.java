package com.dkq.mapper;

import com.dkq.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface OrderMapper {

    Integer add(Integer uid,Integer getid,Integer backid,Double oprice,Integer cid,String ostatus);

    List<Order> all(Integer uid);

    Integer delete(String id);
}
