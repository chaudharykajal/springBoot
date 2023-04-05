package com.sbjpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sbjpa.model.Employee;
import com.sbjpa.repository.EmployeeRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository EmpRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method 
		
//		EmpRepo.save(new Employee("Rahul","Gandhi","rahul@gmail.com","Bangalore",45000.00));
//		EmpRepo.save(new Employee("Sonia","Gandhi","sonia@gmail.com","New Delhi",55000.00));
//		EmpRepo.save(new Employee("Priyanka","Gandhi","priyanka@gmail.com","Bangalore",65000.00));
//		EmpRepo.save(new Employee("Rajiv","Gandhi","rajiv@gmail.com","Ahemdabad",75000.00));
//		EmpRepo.save(new Employee("Mahatma","Gandhi","mahatama@gmail.com","Ahemdabad",85000.00));
//
		
		EmpRepo.findByEmploc("Bangalore").forEach(System.out::println);
	}

}
