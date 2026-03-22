package com.nisha.oops.inheritance.sinlge_inheritance;

public class B extends A{//extends keyword is used to inherit 
	
	void test() {
		System.out.println(" B class inhering A ");
	}
	
	public static void main(String [] args) {
		B obj = new B();
		obj.Display();
		obj.test();
		
	}
		// we performed single inheritance
}
