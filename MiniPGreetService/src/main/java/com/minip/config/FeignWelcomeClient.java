package com.minip.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WelcomeService")
public interface FeignWelcomeClient {

	@GetMapping("/welcome")
	public String welcomeMsg();
	
}
