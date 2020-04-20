package com.woniuxy.springboot.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/second")
	public String test(Model model) {
		model.addAttribute("a","aaa");
		model.addAttribute("hello","<h1>HELLO</h1>");
		model.addAttribute("users",Arrays.asList("user1","user2"));
		return "a";
	}
}
