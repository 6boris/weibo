package com.weibo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@Controller
public class WeiboApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeiboApplication.class, args);
	}

	/**
	 * /**
	 * 当号访问IP时自动跳转到IP/index
	 * @param response
	 * @throws Exception
	 */

	@RequestMapping(value = "/" ,method = RequestMethod.GET)
	public void index(HttpServletResponse response) throws Exception {
		response.sendRedirect("/index");
	}
}
