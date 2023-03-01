package task_core_java;

class Test1{
	String name;
	int age;
	public Test1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Test1 [name=" + name + ", age=" + age + "]";
	}
	
}
public class DeepCopyTest {
	public static void main(String[] args) {
		Test1 ts=new Test1("Gaurav", 23);
		System.out.println(ts.toString());
		Test1 ts2=new Test1("Sharma", 32);
		ts2.name=ts.name;
		ts2.age=ts.age;
		System.out.println(ts.toString());
	}
}
