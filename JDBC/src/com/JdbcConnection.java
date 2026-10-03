package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public static void main(String[] args) {
		
		
		
		try {
			
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			//Define the Connection URL
			String url = "jdbc:mysql://localhost:3306/14july_java";
			String user = "root";
			String password = "root";
			
			// Establish the Connection
			Connection cn =  DriverManager.getConnection(url,user,password);
			System.out.println("connection established");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
