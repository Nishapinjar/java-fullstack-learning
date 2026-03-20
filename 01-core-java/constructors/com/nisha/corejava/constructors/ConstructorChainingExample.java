package com.nisha.corejava.constructors;

public class ConstructorChainingExample {

	int x;

	ConstructorChainingExample() {//this keyword
		this(20);
	}

	ConstructorChainingExample(int a) {
		x = a;
	}

	public static void main(String[] args) {

		ConstructorChainingExample obj = new ConstructorChainingExample();
		System.out.println(obj.x);
	}
}
