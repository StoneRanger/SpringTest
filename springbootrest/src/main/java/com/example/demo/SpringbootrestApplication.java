package com.example.demo;

// https://dzone.com/articles/spring-boot-restful-web-service-complete-example

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class SpringbootrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestApplication.class, args);
	}

}
