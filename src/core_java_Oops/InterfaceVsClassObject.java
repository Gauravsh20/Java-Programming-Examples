package core_java_Oops;
class A{
	void display() {
		System.out.println("Class A");
	}
}
class B extends A{
	void Show () {
		System.out.println("Class B");
	}
}


public class InterfaceVsClassObject {
	public static void main(String[] args) {
		A a=new B();
		/* B b=new A(); */
		A ab=new A();
		B ba=new B();
		a.display();
		/* a.Show(); */
		ab.display();
		/*ab.Show();
		
		 * b.Show(); b.display();
		 */

	
	}
}
