package com.dbex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcTemplateExApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcTemplateExApplication.class, args);
		System.out.println("Test Case 1");
	}

}
