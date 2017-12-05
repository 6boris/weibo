package com.weibo.controller.api;

import com.weibo.bean.User;
import com.weibo.controller.ApiBasicController;
import com.weibo.extend.MS_Result;
import com.weibo.extend.toJson;
import com.weibo.service.UserService;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.weibo.extend.Now_Session;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-11-30-7:45 PM-
 */
@RestController
public class UserApiController extends ApiBasicController{

    @Resource
    private UserService userService;

    @Autowired
    StringEncryptor stringEncryptor;


    /**
     *用户登录接口
     *
     * @param request
     * @param response
     * @return
     * @throws ParseException
     * @throws IOException
     */

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request,
                        HttpServletResponse response
                        ) throws ParseException, IOException {



//        实例化相关对象
        MS_Result res = new MS_Result();
        res.setStatus(1);
        res.setMessages("系统内部错误！");

        toJson json = new toJson();


//        获取用户密码
        String username = request.getParameter("name");
        String password = request.getParameter("password");
        User user = userService.findByName(username).get(0);


//        判断户名为空时
        if(username.equals("")) {
            res.setAll(1,"用户名不能为空",null);
            return json.toForMatJson(res);
        }
//        判断密码为空时
        if(password.equals("")) {
            res.setAll(1,"密码不了为空",null);
            return json.toForMatJson(res);
        }
//      判断用户名是否存在
        if( userService.countByName(username) == 0 ){
            res.setAll(1,"用户名不存在",null);
            return json.toForMatJson(res);
        }
//      判断用户是否被锁定
        if(userService.findByName(username).get(0).getStatus() == 0) {
            res.setAll(1, "用户已经被锁定", null);
            return json.toForMatJson(res);
        }
        String cpassword = userService.findByName(username).get(0).getPassword();
//        判断用户密码是否匹配
        if(!password.equals(stringEncryptor.decrypt(cpassword))) {
            res.setAll(1, "用用户名或者密码错误", null);
            return json.toForMatJson(res);
        }

//        登录成功

        res.setAll(0,"登录成功",null);

        nowsession(request).setAttribute("uid",user.getId());
        System.out.println(nowsession(request).getAttribute("userlogin"));

        return json.toJson(res);

    }

//    注册接口
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(HttpServletRequest request)
            throws ParseException, IOException {

        //        实例化相关对象
        MS_Result res = new MS_Result();
        res.setStatus(1);
        res.setMessages("系统内部错误！");
        User user = new User();

        toJson json = new toJson();

//      获取Ajax传递的参数
        String username =  request.getParameter("username");
        String password =  request.getParameter("password");
        String realname =  request.getParameter("realname");

//        检测用户名是否存在
        if( userService.findByName(username).size() > 0 ){
            res.setAll(1,"用户已经存在",null);
            return json.toForMatJson(res);
        }

//      检测密码长度
        if(true){

        }
//      保存用户

        user.setUsername(username);
        user.setPassword(stringEncryptor.encrypt(password));
        userService.save(user);
        request.getSession().setAttribute("uid",user.getId());
        System.out.println(user.getId());


        res.setAll(0,"注册成功",null);
        return json.toForMatJson(res);

    }

//  用户注销
    @RequestMapping(value = "loginout")
    public void loginout(HttpServletRequest request,
                           HttpServletResponse response)
            throws  IOException {

         nowsession(request).setAttribute("uid",null);
         System.out.println(request.getSession().getAttribute("uid"));
         response.sendRedirect("/login");
     }


    public HttpSession nowsession(HttpServletRequest request){
        return request.getSession();
    }




}

