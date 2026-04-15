package com.nisha.Customexceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class customExcetionExample {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your email");
		String email = sc.next();
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jan_15_db", "root", "root");
			
			Statement stmnt = con.createStatement();
			
			ResultSet result = stmnt.executeQuery("select * from employee where email = '"+email+"'");
			
			if(!result.next()) {
				try {
				throw new RecordNotFoundException("No such record");
			}catch(RecordNotFoundException e) {
				e.printStackTrace();
			}
			
		} else {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
