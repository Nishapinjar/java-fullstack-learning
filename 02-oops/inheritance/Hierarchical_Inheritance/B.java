package Hierarchical_Inheritance;

public class B extends A{

	void test1() {
		System.out.println(" class B inheriting A");
	}
	
	public static void main(String [] args) {
		
		B obj = new B();
		obj.test();
		obj.test1();
	}

}
