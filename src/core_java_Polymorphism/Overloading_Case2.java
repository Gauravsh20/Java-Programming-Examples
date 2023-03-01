package core_java_Polymorphism;

class overloadingcase2{
	public void m1(String s) {
		System.out.println("String ");
	}
	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer class");
		
	}
}


public class Overloading_Case2 {

	public static void main(String[] args) {
		overloadingcase2 oc2=new overloadingcase2();
		oc2.m1("Radhe");
		oc2.m1(new StringBuffer("Shayam"));
		/* oc2.m1(null); */ //bcz both are different class not related to each other
		//object----->String,
		//object------>StringBuffer
		

	}

}
