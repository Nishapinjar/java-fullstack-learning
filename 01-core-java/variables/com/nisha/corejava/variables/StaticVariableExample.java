package com.nisha.corejava.variables;

public class StaticVariableExample {

	static int x = 200; //used static keyword
	
	public static void main(String[] args) {
		
		//StaticVariableExample obj = new StaticVariableExample(); not needed as we access static variable using class.
		//even if we use obj ...it is corrected to class in java
		StaticVariableExample.x = 300;
		
		System.out.println(StaticVariableExample.x);
		
	}
	
	//static int x = 200; ouside method inside class but better to create variable in top
}
