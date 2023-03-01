package core_java_Polymorphism;

class Test3{
	public void m1() {
		System.out.println("Print m1 no-agrs");
	}
	public void m1(int i) {
		System.out.println("Print m1 int-agrs");
	}
	public void m1(double a) {
		System.out.println("Print m1 double-agrs");
	}
	public void m1(String a) {
		System.out.println("Print m1 String-agrs");
	}
}


public class OverloadingExample {
	public static void main(String[] args) {
		Test3 t3=new Test3();
		t3.m1();
		t3.m1("gaurav");
		t3.m1(2);
		t3.m1(2.2);
	}

}
