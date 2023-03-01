package core_java_Interfaces;
class A{
	public void display () {
		System.out.println("Class a");
	}
}
class B extends A{
	public void display () {
		super.display();
		System.out.println("Class B");
	}
}


public class InterfaceVsClassObject {
	public static void main(String[] args) {
		A a=new B();
		/* B b=new A(); */
		/* A ab=new A(); */
		B ba=new B();
		//ba.display();
		a.display();
		/* a.Show(); */
		/* ab.display(); */
		/*ab.Show();
		
		 * b.Show(); b.display();
		 */

	
	}
}
