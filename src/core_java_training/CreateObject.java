package core_java_training;

class Objects{
	void fun() {
		System.out.println("Hello..!");
	}
}

public class CreateObject {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		 Objects
		 obj=(Objects)Class.forName("Core_java_training.Objects").newInstance();
		 
		Objects obj1=new Objects();
		System.out.println(obj1.hashCode());
		
	}

}
