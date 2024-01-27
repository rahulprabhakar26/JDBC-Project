package com.kodnest.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdatedClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");

		// loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connection Information
		String url = "jdbc:mysql://localhost/kodnest5";
		String username = "root";
		String password = "Root@123";
		
		//executing sql statements
		String sql= "Update student set name =? where id=?";
		

		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter the name to be set");
		 String name = scan.nextLine();
	
		System.out.println("Enter the ID");
		int id = scan.nextInt();
		

		Connection connection = DriverManager.getConnection(url, username, password);
		//System.out.println(connection + "Connection success");

		//creating the statement
		 PreparedStatement pt = connection.prepareStatement(sql);
		 pt.setString(1, name);
		 pt.setInt(2, id);
		 
		
		int executedUpdate = pt.executeUpdate();
      
        	System.out.println(executedUpdate+" success");
		
		//System.out.println("Success-"+executedUpdate);
		
	}
}
