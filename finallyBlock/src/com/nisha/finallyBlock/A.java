package com.nisha.finallyBlock;

public class A {

	public static void main(String[] args) {
		
		try {
			
			int a = 10/0;
		} 
		
		catch (ArithmeticException e) {
			e.printStackTrace();//even if exception not handle by removing cathc block still finally will run
		} 
		finally {
			System.out.println("Finally block");
		}
	}

}
