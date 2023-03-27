package com.studentreg.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.studentreg.psa.Student;
@Component
public class MyRunner implements CommandLineRunner {

	@Autowired 
	Student si;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("B");
		si.insert();
		List li=si.selectData();
		li.forEach(x->System.out.println(x));
		

	}

}
