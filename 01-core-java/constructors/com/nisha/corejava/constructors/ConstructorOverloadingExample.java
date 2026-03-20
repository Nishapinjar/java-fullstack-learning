package com.nisha.corejava.constructors;

public class ConstructorOverloadingExample {

	int x;

	ConstructorOverloadingExample() {//constructors can not be same 
		x = 10;
	}

	ConstructorOverloadingExample(int a) {//constructor with argument
		x = a;
	}

	public static void main(String[] args) {

		ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample();
		ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(100);

		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}
