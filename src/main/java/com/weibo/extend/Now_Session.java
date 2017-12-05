package com.weibo.extend;

import org.springframework.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-12-05-8:30-
 */
public class Now_Session {
    public HttpSession nowsession(HttpServletRequest request){
        return request.getSession();

    }

}
