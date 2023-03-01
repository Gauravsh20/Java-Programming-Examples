package core_java_Oops;

abstract class Student{
	private String name;
	private int age;
	private int rollno;
	abstract String add();
	
	public Student(String name,int age,int rollno) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		
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

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
	}
		
}
class AddStudent extends Student{

	public AddStudent(String name, int age, int rollno) {
		super(name, age, rollno);
		System.out.println("Name-"+name);
		System.out.println("roll no-"+rollno);
		System.out.println("Age-"+age);
	}

	public String add() {
		return "Added Successfully";
	}
	
	
}


public class EncapsulationExample {

	public static void main(String[] args) {
		Student s1=new AddStudent("Gaurav",23,1023);
		System.out.println(s1.toString());
		System.out.println(s1.add());
		Student s2=new AddStudent("Raju",25,1025);
		System.out.println(s2.toString());
		System.out.println(s2.add());
		System.out.println(s2.getName()+" Age is ="+s2.getAge());
		

	}

}
