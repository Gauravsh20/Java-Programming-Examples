package Core_java_inheritance;

class Employee{  
	 float salary=40000;  
	} 

public class ExampleInherit extends Employee {
	 int bonus=10000; 
	public static void main(String[] args) {
		 ExampleInherit p=new ExampleInherit();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);  

	}

}

 
	