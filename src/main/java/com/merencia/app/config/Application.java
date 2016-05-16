package com.merencia.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.merencia.app" })
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run( Application.class, args );
	}
}