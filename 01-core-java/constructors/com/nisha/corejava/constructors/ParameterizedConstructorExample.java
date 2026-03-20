package com.nisha.corejava.constructors;

public class ParameterizedConstructorExample {

	int x;

	ParameterizedConstructorExample(int a) {
		x = a;
	}

	public static void main(String[] args) {

		ParameterizedConstructorExample obj = new ParameterizedConstructorExample(50);
		System.out.println(obj.x);
	}
}
