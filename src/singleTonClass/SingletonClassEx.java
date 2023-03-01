package singleTonClass;

class Employees{
	
	private static Employees emp1 = new Employees();
	static int empid1;
	static String name;
	static int age1;
	
	private Employees() {
		super();
		this.empid1 = 0;
		this.name = "";
		this.age1 = 0;
	}

	@Override
	public String toString() {
		return "Employees [Emp. ID=" + emp1.empid1 + ",Emp. Name=" + emp1.name+",Emp. Age=" + emp1.age1+"]";
	}

	static Employees getinstance(int empid, String name, int age) {
	    emp1.empid1 = empid;
	    emp1.name = name;
	    emp1.age1 = age;
		return emp1;
	}

	
}

public class SingletonClassEx {
	public static void main(String[] args) {
		Employees emp2 = Employees.getinstance(1001, "Gaurav", 23);
		Employees emp3 = Employees.getinstance(1002, "Sohan", 32);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
