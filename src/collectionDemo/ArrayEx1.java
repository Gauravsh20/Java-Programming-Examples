package collectionDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Employee{
	int empid;
	String name;
	public Employee(int id ,String name) {
		this.empid=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
}


public class ArrayEx1 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader fb=new BufferedReader(new InputStreamReader(System.in));
		/* Scanner sc=new Scanner(System.in); */
		 Employee[] emp=new Employee[4];
		 for(int i=0;i<3;i++) {
			 System.out.print("Enter the Employee Id--");
			 int id=Integer.parseInt(fb.readLine());
			 System.out.print("Enter the Name of Employee --");
			 String name=fb.readLine();
			 emp[i]= new Employee(id,name);
		 }
		 for(int j=0;j<emp.length;j++) {
			
			System.out.println(emp[j].toString());
			
		 }
		
	}

	

}
