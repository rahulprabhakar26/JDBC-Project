package com.kodnest.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");

		// loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connection Information
		String url = "jdbc:mysql://localhost/kodnest5";
		String username = "root";
		String password = "root@123";
		
		//executing the sql statements
			String sql= "delete from student where id=?";
			
			System.out.println("Enter the ID");
			Scanner scan= new Scanner(System.in);
			int id = scan.nextInt();
			
			//Establishing connection
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection + "Connection success");

		//creating the statement
		 PreparedStatement pt = connection.prepareStatement(sql);
		 pt.setInt(1, id);
		

		int executedUpdate = pt.executeUpdate();
      
		System.out.println("Success-"+executedUpdate);
		
	}
}
