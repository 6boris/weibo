package com.weibo.config;

import com.weibo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-11-30-7:12 PM-
 */
@Configuration
public class MyWebApplicationConfig extends WebMvcConfigurerAdapter {	// 定义MVC配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {	// 进行拦截器的注册处理操作
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login")
                .excludePathPatterns("/register")
                .excludePathPatterns("/api/login") ;	// 匹配路径
        super.addInterceptors(registry);
    }
}
