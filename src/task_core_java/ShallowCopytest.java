package task_core_java;
class Test3{
	String name;
	int age;
	public Test3(String name, int age) {
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
		return "Test3 [name=" + name + ", age=" + age + "]";
	}
	
}
public class ShallowCopytest {
	public static void main(String[] args) {
		Test3 ts=new Test3("Radhe", 23);
		System.out.println(ts.toString());
		Test3 tss=ts;
		System.out.println(ts.toString());
		System.out.println(tss.toString());
	}

}
