package com.weibo.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weibo.bean.User;
import net.minidev.json.JSONArray;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;

import com.weibo.extend.toJson;

@RestController
public class SessionController {


    /**
        对象转JSON后输出
    */

    @RequestMapping(value = "session")
    public void session() throws ParseException, IOException {
        User user = new User();
        user.setId('1');
        user.setUsername("嘿嘿嘿");
        user.setPassword("123456");

        ObjectMapper mapper = new ObjectMapper();
//        将对象转为普通JSON不利于阅读
//        String json = mapper.writeValueAsString(user);
//        将对象转为利于阅读的JSON
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(json);

    }

    @RequestMapping("/demo/session")
    public void json(HttpServletRequest request, HttpSession session)  throws ParseException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setId('1');
        user.setUsername("嘿嘿嘿");
        user.setPassword("123456");

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);

        System.out.print(json);
    }

}
