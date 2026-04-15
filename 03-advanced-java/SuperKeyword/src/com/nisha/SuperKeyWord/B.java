package com.nisha.SuperKeyWord;

public class B extends A {

	B(){
		super();//if super keywprd not mentioned it gets added by compiler to ensure parent class construcotr runs first 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new B();
	}

}
