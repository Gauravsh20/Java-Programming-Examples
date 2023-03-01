package Core_java_inheritance;
class Animal{
	public void eat() {
		System.out.println("Eat");
	}
}
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
public class TestSingleInheritance {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.eat();
		Dog dog=new Dog();
		dog.bark();

	}

}
