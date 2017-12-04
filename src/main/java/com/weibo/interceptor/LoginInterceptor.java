package com.weibo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-11-30-7:10 PM-
 */
@Controller
public class LoginInterceptor implements HandlerInterceptor {
    private Logger log = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        this.log.info("【*** LoginInterceptor.preHandle() ***】" + handlerMethod.getBean().getClass().getSimpleName());
        return true;    // 如果返回false表示不继续请求，如果返回true表示继续请求
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;

        this.log.info("【*** LoginInterceptor.postHandle() ***】" + handlerMethod.getBean().getClass().getSimpleName());
        this.log.info("【*** LoginInterceptor.postHandle() ***】" + modelAndView);

//        response.sendRedirect("login");
        return;
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        this.log.info("【*** LoginInterceptor.afterCompletion() ***】拦截处理完毕");
    }



}