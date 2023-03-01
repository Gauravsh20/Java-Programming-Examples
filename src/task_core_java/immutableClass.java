package task_core_java;

final class Employee {
		private final String name;
		private final String empid;
		public Employee(String name, String empid) {
			super();
			this.name = name;
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public String getEmpid() {
			return empid;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", empid=" + empid + "]";
		}
		
}

public class immutableClass {
	public static void main(String[] args) {
		Employee emp1=new Employee("Gaurav", "E001");
		Employee emp3=emp1;
		System.out.println(emp1.toString());
		System.out.println(emp1.hashCode());
		System.out.println(emp3.hashCode());
		
		
		
	}

}
