package com.studentreg.psa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Student {
   @Autowired
   
   JdbcTemplate jt;
   
   public void insert()
   {
	   System.out.println("C");
	   String inst="insert into stud1 values(1,'Rahul')";
	   jt.update(inst);
   }
   
   public List selectData()
   {
	   List li=jt.queryForList("Select * from stud1");
	   return li;
   }
}
