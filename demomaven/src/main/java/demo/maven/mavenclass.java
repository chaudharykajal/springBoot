package demo.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class mavenclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//load required driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection using DriverManager
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root & password=root");
			
			Statement st = con.createStatement();
			
			st.executeUpdate("insert into emp1 values(107,'kajal',1000000)");
			System.out.println("Data Inserted successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
