package com.classifieds.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		System.out.println("test build pipeline");
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
