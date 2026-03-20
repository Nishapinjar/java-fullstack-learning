package com.nisha.corejava.methods;

public class MethodWithArguments {

	void display(String name) { //string name is argument here
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {

		MethodWithArguments obj = new MethodWithArguments();
		obj.display("Nisha");
	}
}
