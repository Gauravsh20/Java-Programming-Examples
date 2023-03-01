package task_core_java;
interface A{
	int a=10;
}
interface B{
	int b=20;
}
interface D extends A,B{
	void sum();
}
class C implements D{

	public void sum() {
		System.out.println("Sum is :"+(a+b));
		
	}
	
}
public class Test5 {
	public static void main(String[] args) {
		C c=new C();
		c.sum();
		
	}
	

}
