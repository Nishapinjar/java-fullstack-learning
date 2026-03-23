package com.nisha.oops.abstraction;


abstract class ShapeExample{
	
	abstract void draw();
}

class Circle extends ShapeExample{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
	}
	
	
}
public class Shape {

	public static void main(String [] args) {
		
		ShapeExample obj = new Circle();
		
		obj.draw();
	}
}
