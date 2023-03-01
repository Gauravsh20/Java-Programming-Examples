package core_java_Polymorphism;

class OverVar{
	String st="Gaurav";
	static String st1="Gaurav";
	String st2="Gaurav";
	
}

class Ov2 extends OverVar{
	String st="Sharma";
	String st1="Sharma";
	static String st2="Sharma";
}
public class OrverridingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverVar ovv=new OverVar();
		//System.out.println(ovv.st);
		//System.out.println(ovv.st1);
		System.out.println(ovv.st2);
		
		Ov2 ov=new Ov2();
		//System.out.println(ov.st);
		//System.out.println(ov.st1);
		System.out.println(ov.st2);
		
		OverVar vo=new Ov2();
		//System.out.println(vo.st);
		//System.out.println(vo.st1);
		System.out.println(vo.st2);
		
	}

}
