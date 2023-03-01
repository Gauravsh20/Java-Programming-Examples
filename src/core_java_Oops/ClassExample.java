package core_java_Oops;
class Dog{
	String name;
	String color;
	int age;
	
	Dog(String name,String color,int age){
		this.name=name;
		this.color=color;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	void eat() {
		System.out.println("Eating..");
	}
	public void running() {
		System.out.println("Running...");
	}
	
	
}

public class ClassExample {
	public static void main(String[] args) {
		Dog tom = new Dog("Tommy", "Black",4 );
		Dog toms = tom;
		System.out.println(tom.equals(toms));
		System.out.println(tom.toString());
		
		
	}
}
