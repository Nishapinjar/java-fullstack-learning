package com.nisha.corejava.variables;

public class InstanceVariableExample {

	int x = 100; //instanceVariable or nonstaticVariable
	public static void main(String[] args) {

		InstanceVariableExample obj = new InstanceVariableExample();
		
		obj.x = 200;// non static variables can be accessed using object
		System.out.println(obj.x);
	}

	//int x = 100; outside method inside class
}
