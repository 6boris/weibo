package com.weibo.controller.index;

import com.weibo.bean.User;
import com.weibo.controller.IndexBasicController;
import com.weibo.controller.UserBasicController;
import com.weibo.service.UserService;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-11-30-5:40 PM-
 */
@Controller
public class UserController extends UserBasicController{

    @Resource
    private UserService userService;

    @Autowired
    StringEncryptor stringEncryptor;


    @RequestMapping(value = "/login")
    public String login(){
        return "index/user/login";
    }

    @RequestMapping(value = "/register")
    public String register(){
        return "index/user/register";
    }

    @RequestMapping(value = "/index/userinfo")
    public String info(HttpServletRequest request,
                       HttpServletResponse response,
                       Model model
                       ){

        Integer uid =  Integer.valueOf(request.getSession().getAttribute("uid").toString());

        User user = userService.findById(uid);

        model.addAttribute("users", user) ;


        return "index/user/info";
    }


}
