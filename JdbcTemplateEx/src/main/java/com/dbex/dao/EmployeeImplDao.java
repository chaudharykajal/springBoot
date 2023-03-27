package com.dbex.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImplDao  {
	@Autowired
	JdbcTemplate jt;
	
	public void insertRecords() {
		String inst="insert into emp3 values(101,'Rahul')";
		jt.update(inst);
		System.out.println("Test Case 3");
	}
	public List getRecords() {
		List li=jt.queryForList("Select * from emp3");
		System.out.println("Test Case 4");
		return li;
	}
	
}
