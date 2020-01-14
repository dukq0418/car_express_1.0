package com.dkq.controller;

import com.dkq.entity.City;
import com.dkq.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/carsys/city")
public class CityController {

    @Autowired
    private CityService cityService;
    @RequestMapping("/select.do")
    @ResponseBody
    public List<City> queryByPid(Integer pid){
        List<City> cities = cityService.queryByPid(pid);
        return cities;
    }

    @RequestMapping("/citys.do")
    @ResponseBody
    public List<City> citys(Integer getid,Integer backid,Integer cid){
        City getcity = cityService.queryByGetid(getid);
        City backcity = cityService.queryByBackid(backid);
        List<City> cities = new ArrayList<>();
        cities.add(getcity);
        cities.add(backcity);
        return cities;
    }


}
