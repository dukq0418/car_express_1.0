package com.dkq.mapper;

import com.dkq.entity.Car;
import com.dkq.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarMapper {
    List<Car> queryByCity(Integer getid,Integer backid);

    List<Car> queryPrice(Integer getid);

    List<Car> queryNumber(Integer getid);

    Car findcar(Integer cid);

}
