package com.dkq.service;

import com.dkq.entity.City;

import java.util.List;

public interface CityService {
    List<City> queryByPid(Integer pid);

    City queryByGetid(Integer getid);

    City queryByBackid(Integer backid);
}
