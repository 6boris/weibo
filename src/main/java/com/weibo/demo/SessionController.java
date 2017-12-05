package com.weibo.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weibo.bean.User;
import com.weibo.service.UserService;
import net.minidev.json.JSONArray;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;

import com.weibo.extend.toJson;

@RestController
public class SessionController {

    @Resource
    private UserService userService;

    @Autowired
    StringEncryptor stringEncryptor;

    @RequestMapping(value = "session")
    public void session(HttpServletRequest request) throws ParseException, IOException {
        User user = userService.findByName("admin").get(0);

        nowsession(request).setAttribute("uid",user.getId());
        System.out.println(nowsession(request).getAttribute("uid"));

    }

    public HttpSession nowsession(HttpServletRequest request){
        return request.getSession();
    }

}
