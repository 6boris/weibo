package com.weibo.controller.index;

import com.weibo.controller.IndexBasicController;
import com.weibo.controller.UserBasicController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-11-30-5:40 PM-
 */
@Controller
public class UserController extends UserBasicController{

    @RequestMapping(value = "/login")
    public String login(){
        return "index/user/login";
    }

    @RequestMapping(value = "/register")
    public String register(){
        return "index/user/register";
    }

}
