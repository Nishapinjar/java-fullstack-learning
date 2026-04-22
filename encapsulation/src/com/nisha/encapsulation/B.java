package com.nisha.encapsulation;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		
		//a.password = 1234; this is not possible bcz password is private so we use getter setter methods
		
		a.setPassword(1234);
		System.out.println(a.getPassword());
	}

}
