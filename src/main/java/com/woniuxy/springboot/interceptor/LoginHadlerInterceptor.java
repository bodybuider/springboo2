package com.woniuxy.springboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginHadlerInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object object = request.getSession().getAttribute("username");
		if(object==null) {
			request.setAttribute("msg", "请登录后再执行操作");
			//转发到模板引擎下的login
			request.getRequestDispatcher("/").forward(request, response);
			return false;
		}
		return true;
	}
}
