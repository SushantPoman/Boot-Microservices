package com.minip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Autowired
	Environment environment;
	
	@Value("${message}")
	String msg;
	
	@GetMapping("/welcome")
	public String welcome() {
		String port= environment.getProperty("server.port");
		return "Welcome to microservice practice on port "+port;
	}
	
	@GetMapping("/config-msg")
	public String message() {
		return msg;
	}
}
