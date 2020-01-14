package com.dkq.service.impl;

import com.dkq.entity.Car;
import com.dkq.entity.City;
import com.dkq.mapper.CityMapper;
import com.dkq.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> queryByPid(Integer pid) {
        return cityMapper.queryByPid(pid);
    }

    @Override
    public City queryByGetid(Integer getid) {
        return cityMapper.queryByGetid(getid);
    }

    @Override
    public City queryByBackid(Integer backid) {
        return cityMapper.queryByBackid(backid);
    }


}
