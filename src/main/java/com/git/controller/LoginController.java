package com.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/login")
	public String login()
	{
		System.out.println("vinod");
		System.out.println("sayali");
		System.out.println("hello");
		return "Hello world!!!!!!!!!!";
		
	}

}
