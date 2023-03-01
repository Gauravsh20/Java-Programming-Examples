package Core_java_inheritance;

interface InterA{
	public void m1();
}
interface InterB{
	public void m1();
}
class Interclass implements InterA,InterB{
	public void m1() {
		System.out.println("Radhe Shayam ji");
	}
}

public class Ex_MultiInterface {
	public static void main(String[] args) {
		InterA a=new Interclass();
		InterB b=new Interclass();
		a.m1();
		b.m1();
	}
	

}
