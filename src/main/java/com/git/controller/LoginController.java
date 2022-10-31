package com.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/login")
	public String sayHello()
	{
		System.out.println("vinod");
		System.out.println("hello");
		return "Hello world!!!!!!!!!!";
		
	}
}

}
