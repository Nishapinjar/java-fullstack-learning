package com.nisha.corejava.methods;


class Student {
	String name;
}

public class ObjectArgumentExample {

	void display(Student s) { // method with argument
		System.out.println(s.name);
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Nisha";

		ObjectArgumentExample obj = new ObjectArgumentExample();
		obj.display(s1); //using object passing value
	}
}
