package com.weibo.controller;

import com.weibo.bean.User;
import com.weibo.service.UserService;
import org.apache.catalina.Session;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class DemoController {

    @Resource
    private UserService userService;

    @Autowired
    StringEncryptor stringEncryptor;

    @RequestMapping(value = "demo")
    public User demo(){
        User user = userService.findById(1);
        user.setPassword(stringEncryptor.encrypt("admin"));
        userService.save(user);
        return user;

    }

    @RequestMapping(value = "demo1")
    public  String demo1(Model model){
        List<User> user = userService.getAll();
        model.addAttribute("users", user) ;
        System.out.print(user.get(1).getUsername());
        return "demo1";
    }


    @RequestMapping(value = "/user")

    public String userlist(Model model){
        List<User> user = userService.getAll();
        model.addAttribute("users", user) ;
        System.out.print(user.get(1).getUsername());
        return "userlist";
    }




}
