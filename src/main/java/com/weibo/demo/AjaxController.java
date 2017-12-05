package com.weibo.demo;

import com.weibo.bean.User;
import com.weibo.service.UserService;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-12-05-10:53-
 */
@RestController
public class AjaxController {


    @Resource
    private UserService userService;

    @Autowired
    StringEncryptor stringEncryptor;

    @RequestMapping(value = "ajax")
    public Integer JSON(HttpServletRequest request){
//        System.out.println(userService.countByName("admin11"));
        Integer uid;
        if(request.getSession().getAttribute("uid") == null){
            uid = 0;
        }else{
            uid = Integer.valueOf(request.getSession().getAttribute("uid").toString());
        }
        return uid;


    }
}
