package com.kodnest.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");

		// loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connection Information
		String url = "jdbc:mysql://localhost/kodnest5";
		String username = "root";
		String password = "Prabhakar@0626#";
		
		//executing the sql statement
		String sql= "insert into student values(? ,?)";
		
		System.out.println("Enter the ID");
		Scanner scan= new Scanner(System.in);
		int id = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter the name");
		String name = scan.nextLine();

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection + "Connection success");
		
		//creating the statement
		PreparedStatement pt = connection.prepareStatement(sql);
		 pt.setInt(1, id);
		 pt.setString(2, name);
		 
		 int executeUpdate = pt.executeUpdate();
		 
		 System.out.println(executeUpdate+ "Success");
		
     
     	
 
     	
//		String str2= "insert into student values(2,'Jhon')";
//		st.execute(str2);
//		
//		String str3= "insert into student values(3,'prabhakar')";
//		st.execute(str3);
//		
//		String str4= "insert into student values(4,'Anand')";
//		st.execute(str4);
//		
//		String str5= "insert into student values(5, 'Ujawal')";
//		st.execute(str5);
		
		
		
		
		//System.out.println("Success");
		
	}
}
