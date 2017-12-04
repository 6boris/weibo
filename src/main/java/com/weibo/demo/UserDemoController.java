//package com.weibo.demo;
//
//import com.weibo.bean.User;
//import com.weibo.service.UserService;
//import org.apache.catalina.servlet4preview.http.HttpServletRequest;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: Anonycurse
// * Date-Time: 2017-11-30-8:38 PM-
// */
//public class UserDemoController {
//
//
//    @Resource
//    private UserService userService;
//
//    @RequestMapping(value = "/save")
//    public void save(){
//        User user = new User();
//        user.setUsername("aaa");
//
//        user.setPassword(null);
//        userService.save(user);
//
//
//        System.out.print(user);
//    }
//
//    @RequestMapping(value = "/indexa")
//    public String index(){
//
//        List<User> user = userService.getAll();
//        return "index";
//
//    }
//    @RequestMapping(value = "/find")
//    public String find(HttpServletRequest request){
//        Integer id = Integer.parseInt(request.getParameter("id"));
//        User res =  userService.findById(id);
//        if(userService.exits(id)){
//            System.out.println("不为空");
//            System.out.print(res.getUsername());
//            return res.getUsername();
//        }else{
//            System.out.println("空");
//        }
//        return null;
//    }
//}
