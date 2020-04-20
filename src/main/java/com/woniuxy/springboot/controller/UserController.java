package com.woniuxy.springboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	//登录
	@RequestMapping("login")
	public String login(String username,String password,
			Model model,HttpSession httpSession) {
		if(username.equals("a") && password.equals("aaa")) {
			httpSession.setAttribute("username", username);
			return "redirect:/main";
		}
		model.addAttribute("msg", "用户或密码错误");
		return "login";
	}
}
