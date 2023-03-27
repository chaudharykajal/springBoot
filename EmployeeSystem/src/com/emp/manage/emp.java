package com.emp.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class emp {
	public static void main(String[] args) {

		try {
			//load required driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection using DriverManager
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			Statement st = con.createStatement();
			st.executeUpdate("insert into emp1 values(101,'rahul',45000)");
			st.executeUpdate("insert into emp1 values(102,'sonia',55000)");
			st.executeUpdate("insert into emp1 values(103,'priya',65000)");
			st.executeUpdate("insert into emp1 values(104,'teju',75000)");
			st.executeUpdate("insert into emp1 values(105,'Chanda',85000)");
			st.executeUpdate("insert into emp1 values(106,'devika',95000)");
			System.out.println("Data Inserted successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

