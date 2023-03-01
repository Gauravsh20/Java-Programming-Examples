package core_java_training;

interface Interf{
	
 public void m1();
 public void m2();
 public void m3();
 static void m4() {
	 System.out.println("Hello..!");
 }
	
}

abstract class ServiesProvider implements Interf{
	 
	public void m1() {
		 System.out.println("M1");
	 }
	
	public void m2() {
		 System.out.println("M2");
	 }
	
 }
	class subclass extends ServiesProvider{

		public void m3() {
			System.out.println("M3");
			
		}
		
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass sb=new subclass();
		sb.m1();
		sb.m2();
		sb.m3();
		Interf.m4();
}

}