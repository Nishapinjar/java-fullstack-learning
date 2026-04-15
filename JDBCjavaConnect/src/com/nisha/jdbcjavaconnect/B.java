package com.nisha.jdbcjavaconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your email");
		String email  = sc.next();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jan_15_db", "root", "root");
			
			Statement stmnt = con.createStatement();
			
			//stmnt.executeUpdate("Delete from employee where email = 'adam@gmail.com'");
			stmnt.executeUpdate("Delete from employee where email = '"+email+"'");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
