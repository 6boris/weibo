package com.weibo.controller.api;

import com.weibo.bean.User;
import com.weibo.controller.ApiBasicController;
import com.weibo.extend.MS_Result;
import com.weibo.extend.toJson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-11-30-7:45 PM-
 */
@RestController
public class UserApiController extends ApiBasicController{
    @RequestMapping(value = "/login")
    public String login() throws ParseException, IOException {
        MS_Result res = new MS_Result();
        User user = new User();

        toJson json = new toJson();


        user.setId(1);
        res.setData(json.toJson(user));

        return json.toJson(res);

    }
}

