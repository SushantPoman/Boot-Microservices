package com.minip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MiniPApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniPApiGatewayApplication.class, args);
	}

}
