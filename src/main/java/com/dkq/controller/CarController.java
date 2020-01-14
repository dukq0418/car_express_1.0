package com.dkq.controller;

import com.dkq.entity.Car;
import com.dkq.entity.Order;
import com.dkq.service.CarService;
import com.dkq.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/carsys/car")
public class CarController {

    @Autowired
    private CarService carService;
    @Autowired
    private OrderService orderService;
    @RequestMapping("/queryByGAndB")
    public String queryByGAndB(Integer getid,Integer backid){
        List<Car> cars = carService.queryByCity(getid, backid);
        return "shortsort";
    }

    @RequestMapping("/price.do")
    @ResponseBody
    public List<Car> price(Integer getid){
        List<Car> cars = carService.queryPrice(getid);
        return cars;
    }
    
    @RequestMapping("/number.do")
    @ResponseBody
    public List<Car> number(Integer getid){
        List<Car> cars = carService.queryNumber(getid);
        return cars;
    }

    @RequestMapping("/findcar.do")
    @ResponseBody
    public Car findcar(Integer cid){
        Car findcar = carService.findcar(cid);
        return findcar;
    }
}
