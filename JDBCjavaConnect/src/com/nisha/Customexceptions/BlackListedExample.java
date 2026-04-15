package com.nisha.Customexceptions;

import java.util.Scanner;

public class BlackListedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int balance = 50;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the toll amount");
		int amount = sc.nextInt();
		
		if(balance<amount) {
			try {
				throw new BlackListedException("Low balance");
			} catch (BlackListedException e) {
				e.printStackTrace();			}
		}
		else {
			System.out.println("open the gate");
		}
	}

}
