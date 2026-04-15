package com.nisha.jdbcjavaconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your email");
		String email = sc.next();
		System.out.println("enter your mobile");
		String mobile = sc.next();
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jan_15_db", "root", "root");
		
		Statement stmnt = con.createStatement();
		
		//stmnt.executeUpdate("UPDATE employee set mobile ='9999999999' where email = 'mike@gmail.com'");
		stmnt.executeUpdate("UPDATE employee set mobile ='"+mobile+"' where email = '"+email+"'");

		con.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}

}
