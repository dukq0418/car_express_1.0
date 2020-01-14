package com.dkq.controller;

import com.dkq.entity.Order;
import com.dkq.service.OrderService;
import com.dkq.util.LayStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/carsys/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/add.do")
    @ResponseBody
    public LayStatus add(Integer uid,Integer getid,Integer backid,Double oprice,Integer cid,String ostatus, HttpSession session){
        ostatus = "已预订";
        uid = ((Integer) session.getAttribute("uid"));
        LayStatus layStatus = new LayStatus();
        if(orderService.add(uid, getid, backid, oprice, cid, ostatus)==1){
           layStatus.setCode(1);
           return layStatus;
        }
        return null;
    }

    @RequestMapping("/all.do")
    @ResponseBody
    public List<Order> all(HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");
        List<Order> all = orderService.all(uid);
        return all;
    }

    @RequestMapping("/delete.do")
    public String delete(String id){
        Integer delete = orderService.delete(id);
        return "redirect:/all.do";
    }
}
