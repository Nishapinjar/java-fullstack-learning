package com.nisha.oops.methodoverloadingpolymorphism;

public class A {

	void add(int a, int b) {
		
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String [] args) {
		
		A a1 = new A();
		a1.add(11, 11);
		a1.add(7, 7, 7);
	}
}
