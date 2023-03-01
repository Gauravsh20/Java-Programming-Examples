package core_java_Polymorphism;

class Overridingtest{
	
	public void Fruits() {
		System.out.println("Eating the fruits....");
	}
	public void Vegitables() {
		System.out.println("Eating the Green Vegitables....");
	}
}

class Boy extends Overridingtest{
	public void Vegitables() {
		System.out.println("Not Eating the Green Vegitables....");
	}
}


public class OverridingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------Parent Class Object---------------");
		Overridingtest or=new Overridingtest();
		or.Fruits();
		or.Vegitables();
		System.out.println("-------------Child Class Object--------------");
		Boy by=new Boy();
		by.Fruits();
		by.Vegitables();
		System.out.println("-------------Parent class reference and child Class Object---------------\n");
		Overridingtest ov1=new Boy();
		ov1.Fruits();
		ov1.Vegitables();
		
	}

}
