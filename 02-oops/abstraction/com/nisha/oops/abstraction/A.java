package com.nisha.oops.abstraction;


abstract class Animal{
	
	abstract void sound(); //method is diclared but not imlemented 
	
	void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog Barks");
	}
	
}
public class A {
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		
		a1.eat();
		a1.sound();
	}
	
}
