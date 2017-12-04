package com.weibo.controller.index;

import com.weibo.controller.IndexBasicController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-11-30-7:26 PM-
 */
@Controller
public class IndexController extends IndexBasicController{

    @RequestMapping(value = "")
    public String index(){
        return "index/index";
    }
}
