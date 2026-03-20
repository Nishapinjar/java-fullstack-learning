package com.nisha.corejava.methods;

public class MethodWithoutReturn {

	void display() { // void method does not have return value
		System.out.println("This is a method without return");
	}

	public static void main(String[] args) {

		MethodWithoutReturn obj = new MethodWithoutReturn();
		obj.display();
	}
}
