package core_java_training;



class person{
	String name;
	int age;
	void talk() {
		System.out.println("Hello- I am" + name);
	}

}

public class hashcode {

	public static void main(String[] args) {
		person Raju=new person();
		System.out.println(Raju.hashCode());
		System.out.println(Raju.age);
		System.out.println(Raju.name);

	}

}
