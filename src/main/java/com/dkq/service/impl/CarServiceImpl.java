package com.dkq.service.impl;

import com.dkq.entity.Car;
import com.dkq.mapper.CarMapper;
import com.dkq.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> queryByCity(Integer getid, Integer backid) {
        return carMapper.queryByCity(getid,backid);
    }

    @Override
    public List<Car> queryPrice(Integer getid) {
        return carMapper.queryPrice(getid);
    }

    @Override
    public List<Car> queryNumber(Integer getid) {
        return carMapper.queryNumber(getid);
    }

    @Override
    public Car findcar(Integer cid) {
        return carMapper.findcar(cid);
    }


}
