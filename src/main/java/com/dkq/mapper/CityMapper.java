package com.dkq.mapper;

import com.dkq.entity.Car;
import com.dkq.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityMapper {
    List<City> queryByPid(Integer pid);

    City queryByGetid(Integer getid);

    City queryByBackid(Integer backid);
}
