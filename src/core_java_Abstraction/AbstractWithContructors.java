package core_java_Abstraction;

abstract class AbsCons{
	AbsCons(){
		System.out.println("Abstraction With Constractor...");
		 
	 }
	
	abstract void display();//abstraction method
	
	
	void Show() {
		System.out.println("Noraml method");
	}
	
	
}
class UseMethod extends AbsCons{
	void display() {
		System.out.println("Abstraction Method");
	}
	
}

public class AbstractWithContructors {

	public static void main(String[] args) {
		UseMethod us=new UseMethod();
		us.display();
		us.Show();

	}

}
