package com.nisha.corejava.thiskeyword;

public class Exampple {

	int x;

	Exampple() {
		this(100);
	}

	Exampple(int x) {
		this.x = x;
	}

	public static void main(String[] args) {

		Exampple obj = new Exampple();
		System.out.println(obj.x);
	}
}
