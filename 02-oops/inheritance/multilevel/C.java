package multilevel;

public class C extends B{

	void test2() {
		System.out.println("class C inheriting B ");
	}
	
	public static void main(String [] args) {
		
		C obj = new C();
		obj.test();
		obj.test1();
		obj.test2();
	}
}
