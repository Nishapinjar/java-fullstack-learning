package com.nisha.finallyBlock;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 100/0;
		} 
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//			
//			e.printStackTrace();
//		} 
		finally {
			System.out.println("finally");
		}
		
		System.out.println("welcome");
	}

}
