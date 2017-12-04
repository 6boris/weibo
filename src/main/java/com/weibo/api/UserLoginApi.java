package com.weibo.api;


import com.weibo.bean.User;
import com.weibo.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping(value = "/apt")
public class UserLoginApi {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/apia",method = RequestMethod.POST)
    public User api(HttpServletRequest request){

        User res =  userService.findById(1);
        return res;
    }

    @RequestMapping(value = "/aaa")
    public void user(){
        System.out.print("aaa");
    }


//    @RequestMapping(value = "/session")
//
//    public String session(HttpSession session) throws ParseException, IOException {
//        User user = new User();
//        user.setId(1);
//        user.setUsername("嘿嘿嘿");
//        user.setPassword("123456");
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(user);
//        System.out.println("\nPrinting JSON as String");
//        System.out.println(json);
//        return "asd";
//    }
}
