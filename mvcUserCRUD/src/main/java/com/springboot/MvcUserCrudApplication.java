package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcUserCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcUserCrudApplication.class, args);
		System.out.println("Test case running");
	}

}
