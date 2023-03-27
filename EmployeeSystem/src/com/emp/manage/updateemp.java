package com.emp.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updateemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			Statement st=con.createStatement();
			st.executeUpdate("UPDATE emp1 SET ename='kajal' esal='98000' where eid='101'");
			System.out.println("Table updated successfully");
			
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}

	}

}
