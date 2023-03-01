package task_core_java;

class Students{
	private String name;
	private String rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public Students(String name, String rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + "]";
	}
	
}
public class Bluiderclass {

	public static void main(String[] args) {
	Students st1=new Students("Gaurav", "R001")	;
	System.out.println(st1.toString());
	st1.setRollno("R002");
	System.out.println(st1.toString());

	}
}
