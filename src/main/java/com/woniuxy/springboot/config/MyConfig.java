package com.woniuxy.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.woniuxy.springboot.interceptor.LoginHadlerInterceptor;
import com.woniuxy.springboot.service.MyService;

//这个注解就是告诉系统，当前类是一个配置类
@Configuration
public class MyConfig {
	
	//bean的默认名就是方法名(一般方法名就是把当前类首字母变小写)
	/*
	 * @Bean public MyService getMyService() { return new MyService(); }
	 * 
	 * @Bean public MyService myService() { return new MyService(); }
	 */
	
	
	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			//注册自定义映射路径，有模板引擎，viewname会经过模板引擎解析
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("/login");
				registry.addViewController("/index.html").setViewName("/login");
				registry.addViewController("/main").setViewName("index");
			}
			//注册拦截器拦截的路径
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				InterceptorRegistration interceptor = 
						registry.addInterceptor(new LoginHadlerInterceptor());
				interceptor.addPathPatterns("/**");
				interceptor.excludePathPatterns("/","/index.html","/user/login","/css/**");
			}
		};
	}
	
	
	
}
