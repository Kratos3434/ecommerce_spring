package com.commerce.commerce_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class CommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommerceBackendApplication.class, args);
	}

}
