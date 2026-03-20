package com.nisha.corejava.methods;

public class MethodWithReturn {

	int add(int a, int b) { // if method type is int return value is mandatory of method type
		return a + b;
	}

	public static void main(String[] args) {

		MethodWithReturn obj = new MethodWithReturn();
		int result = obj.add(10, 20); // returning result value of int type 

		System.out.println(result);
	}
}
