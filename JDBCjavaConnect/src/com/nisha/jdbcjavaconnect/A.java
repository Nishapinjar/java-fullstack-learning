package com.nisha.jdbcjavaconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			String name = sc.next();
			System.out.println("enter your email");
			String email = sc.next();
			System.out.println("enter your mobile");
			String mobile = sc.next();
			
			
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jan_15_db", "root", "root");
			System.out.println(con);
			//execute SQL query
			Statement stmnt = con.createStatement();
			
			//to insert values manually
			//stmnt.executeUpdate("insert into employee values('adam', 'adam@gmail.com', '9108837502')");
			//stmnt.executeUpdate("insert into employee values('nisha', 'nsha@gmail.com', '9108837502')");

			//to insert values by taking input from user using scanner class 
			
			stmnt.executeUpdate("insert into employee values('"+name+"', '"+email+"', '"+mobile+"' )");
			//close database connection
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
