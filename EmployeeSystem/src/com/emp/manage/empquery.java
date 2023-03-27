package com.emp.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class empquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			//create statement object 
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp1");
			
			
			int id;
			String name;
			int sal;
			while(rs.next()) {
				id = rs.getInt("eid");
				name = rs.getString("ename");
				sal = rs.getInt("esal");
				
				System.out.println("Employee Id:"+id + "-Name:"+name+"- Salary"+sal);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}

}
