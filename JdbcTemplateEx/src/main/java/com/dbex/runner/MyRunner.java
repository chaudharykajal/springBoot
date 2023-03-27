package com.dbex.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbex.dao.EmployeeImplDao;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	EmployeeImplDao emp;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test Case 2");
		emp.insertRecords();
		List list = emp.getRecords();

	}

}
