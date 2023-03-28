package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	
	@GetMapping("/login")
	public String getLoginPage(){
		System.out.println("Test Case 123");
		return "login";
	}
	
	@PostMapping("/login")
	public String getWelcomePage( @RequestParam String userEmail, @RequestParam String userPassword) {
		
		System.out.println(userEmail);
		
		if(userEmail.equals("admin@gmail.com") && userPassword.equals("admin")) {
			return "welcome";
		}
		else {
			return "invalidlogin";
		}
		
	}

}
