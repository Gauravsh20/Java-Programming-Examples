package core_java_Polymorphism;

class OverloadingCases{
 public void m1(Object obj) {
	 System.out.println("Object version....");
 }
 public void m1(String st) {
	 System.out.println("Strngi version....");
 }
	
}



public class Overloading_Case1 {

	public static void main(String[] args) {
		OverloadingCases over=new OverloadingCases();
		over.m1(new Object());
		over.m1("Radhe");
		over.m1(null);//parent(object) and child class(String) both 
			           //are present in argu than high priority child class 

	}

}
