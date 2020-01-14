package com.dkq.controller;


import com.dkq.entity.User;
import com.dkq.service.UserService;
import com.dkq.util.LayStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/carsys/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public LayStatus login(User user, HttpSession session){
        User user1 = userService.queryByUser(user.getTel(), user.getPassword());
        LayStatus layStatus = new LayStatus();
        if(user1 != null){
            session.setAttribute("tel",user1.getTel());
            layStatus.setCode(1);
            return layStatus;
        }
        return null;
    }

    @RequestMapping("/denglu.do")
    @ResponseBody
    public User denglu(HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");
        User denglu = userService.denglu(uid);
        return denglu;
    }

    @RequestMapping("/register.do")
    @ResponseBody
    public LayStatus register(User user){
        LayStatus layStatus = new LayStatus();
        if(userService.register(user)==1) {
           layStatus.setCode(1);
            return layStatus;
        }
        return null;
    }

    @RequestMapping("/update.do")
    @ResponseBody
    public LayStatus update(User user){
        Integer update = userService.update(user);
        LayStatus layStatus = new LayStatus();
        if(update == 1){
            layStatus.setCode(1);
            return layStatus;
        }
        return null;
    }
}
