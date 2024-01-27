package com.kodnest.jdbc;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");

		// loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connection Information
		String url = "jdbc:mysql://localhost/kodnest5";
		String username = "root";
		String password = "root@123";

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection + "Connection success");

		Statement st = connection.createStatement();
	
		st.execute("create table student ");
}
}
