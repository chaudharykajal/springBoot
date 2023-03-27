package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.beans.HelloBean;

public class MyRunner implements CommandLineRunner {

	@Autowired
	HelloBean helloBean;
	
	@Override
	public void run(String... args) throws Exception {
		helloBean.sayHello();
		System.out.println("Test 2");
	}
}
