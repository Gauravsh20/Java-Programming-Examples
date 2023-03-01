package task_core_java;

class supertest{
	String st="Hello This is Super...";
	public supertest() {
		System.out.println("Super method");
	}
	
}
class thistest extends supertest{
	String stt="This is this....";
	public thistest() {
		System.out.println(this.stt);
		System.out.println("This method");
		System.out.println(super.st);
	}
	
}
public class SuperAndThis {
	public static void main(String[] args) {
		thistest ts=new thistest();
		
		
		
		
	}

}
