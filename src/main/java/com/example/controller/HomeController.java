package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserDtls;
import com.example.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDtls user) {
		System.out.println(user);
		
		UserDtls  userdtls = userService.createUser(user);
		
		
		if (userdtls != null) {
			System.out.println("register successfully");
//			session.setAttribute("msg", "Register Sucessfully");
		} else {
//			session.setAttribute("msg", "Something wrong on server");

			System.out.println("something error in server");
			}
		return "redirect:/register";
	}
}
