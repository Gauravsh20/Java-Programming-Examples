package core_java_Polymorphism;
class OverStatic
{
	public static void m1() {
		System.out.println("Parent Class");
	}
}

class Sub extends OverStatic{
	public static void m1() {
		System.out.println("Child Class");
	}
}



public class OverridingStaticCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverStatic os=new OverStatic();
		os.m1();
		
		Sub s=new Sub();
		s.m1();
		
		OverStatic os1=new Sub();
		os1.m1();
	

	}

}
