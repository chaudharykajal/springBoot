package com.emp.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dropemp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1");
			Statement st=con.createStatement();
			st.executeUpdate("drop e");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
