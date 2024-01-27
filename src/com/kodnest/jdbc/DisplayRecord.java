package com.kodnest.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DisplayRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");

		// loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connection Information
		String url = "jdbc:mysql://localhost/kodnest5";
		String username = "root";
		String password = "Prabhakar@0626#";
		
		//
		String sql= "select * from student where id=?";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scan.nextInt();
		
		

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection + "Connection success");

		 PreparedStatement pt = connection.prepareStatement(sql);
		   pt.setInt(1, id);
		
		
	     ResultSet rs = pt.executeQuery();
	     
	     while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	     }
	}
}
