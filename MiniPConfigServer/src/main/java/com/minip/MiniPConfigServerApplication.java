package com.minip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MiniPConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniPConfigServerApplication.class, args);
	}

}
