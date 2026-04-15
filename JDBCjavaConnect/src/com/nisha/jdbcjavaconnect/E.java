package com.nisha.jdbcjavaconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jan_15_db", "root", "root");
			
			Statement stmnt = con.createStatement();
			
			ResultSet results = stmnt.executeQuery("select * from employee");
			
			while(results.next()) {
				//System.out.println("hello");
				System.out.println(results.getString(1));
				System.out.println(results.getString(2));
				System.out.println(results.getString(3));

			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}

}
