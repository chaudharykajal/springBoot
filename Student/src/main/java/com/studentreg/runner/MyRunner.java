package com.studentreg.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.studentreg.impliment.StudentImpl;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	StudentImpl si;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		si.insertData();
		List list=si.selectData();
		list.forEach(x->System.out.println(x));

	}

}
