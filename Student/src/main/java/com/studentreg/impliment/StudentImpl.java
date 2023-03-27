package com.studentreg.impliment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentImpl implements StudentInterface {
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void insertData()
	{
		String inst="insert into stud1 values(2,'Sonia')";
		jt.update(inst);
	}
	
	@Override
	public List selectData()
	{
		List li=jt.queryForList("select * from stud1");
		return li;
	}
}
