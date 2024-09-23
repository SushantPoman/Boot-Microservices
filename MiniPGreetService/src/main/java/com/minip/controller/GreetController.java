package com.minip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minip.config.FeignWelcomeClient;

@RestController
@EnableDiscoveryClient
public class GreetController {
	
	@Autowired
	FeignWelcomeClient welcomeClient;
	
	@Value("${message}")
	String message;
	
	@GetMapping("/greet")
	public String greet() {
		String msg = welcomeClient.welcomeMsg();
		return "Good morning!! "+msg;
	}
	
	@GetMapping("/config_msg")
	public String getMessage() {
		return message;
	}

}
