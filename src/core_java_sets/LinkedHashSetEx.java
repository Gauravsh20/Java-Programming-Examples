package core_java_sets;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

class EmployeeSet{
	int empid;
	String name;
	public EmployeeSet(int empid,String name ) {
		this.empid=empid;
		this.name=name;
		
	}
	
	public void DisplayEmp() {
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Id : "+empid);
		System.out.println();
		
	}
}
public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<EmployeeSet> emps=new LinkedHashSet<>();
		EmployeeSet emp1=new EmployeeSet(101,"Gaurav");
		emps.add(emp1);
		emps.add(new EmployeeSet(101,"Gaurav"));
		emps.add(new EmployeeSet(102,"Rahul"));
		emps.add(new EmployeeSet(103,"Sunil"));
		
		/* emps.remove(emp1); */
		  for (EmployeeSet employeeSet : emps) { 
			  employeeSet.DisplayEmp();
		  
		  }
		  
		  Iterator<EmployeeSet> i=emps.iterator(); while(i.hasNext()) {
		  System.out.println(i.next().empid); }
		 
        
          							
	}


}