package com.dkq.service;

import com.dkq.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> queryByCity(Integer getid,Integer backid);

    List<Car> queryPrice(Integer getid);

    List<Car> queryNumber(Integer getid);

    Car findcar(Integer cid);
}
