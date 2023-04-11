package com.jerolin.www.helloboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	
	@RequestMapping("/hello")
	public String handler01(){
		return "Hello, Spring Boot 2!";
	}
}
