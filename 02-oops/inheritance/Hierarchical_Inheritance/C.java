package Hierarchical_Inheritance;

public class C extends A {

	void test2() {
		System.out.println(" class C inheriting A");
	}
	
	public static void main(String [] args) {
		
		C obj = new C();
		obj.test();
		obj.test2();
	}

}
