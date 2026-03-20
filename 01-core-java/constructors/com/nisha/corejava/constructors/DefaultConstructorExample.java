package com.nisha.corejava.constructors;

public class DefaultConstructorExample {

	int x; //non static variable

	DefaultConstructorExample() {
		x = 10;
	}

	public static void main(String[] args) {

		DefaultConstructorExample obj = new DefaultConstructorExample();
		System.out.println(obj.x);
	}
}
