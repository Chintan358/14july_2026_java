package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	public static void main(String[] args) {
		
		
		try 
		{
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			
			// Define the Connection URL
			String url = "jdbc:mysql://localhost:3306/14july_java";
			String username = "root";
			String password = "root";
			
			//Establish the Connection
			Connection cn =  DriverManager.getConnection(url,username,password);
			System.out.println("Connection established");
			
			
			//Create a Statement :  1) Statements 2)Prepare statement 3) collable statement
			Statement st =  cn.createStatement();
			
			
			//Execute a Query : 1)execute query (DQL) 2) execute update (DML)
			ResultSet rs =  st.executeQuery("select * from student");
			
			
			//Processthe Result
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString("email");
				
				System.out.println(id+" "+name+" "+email);
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
		
	}
}
