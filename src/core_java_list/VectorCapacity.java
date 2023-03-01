package core_java_list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector arr=new Vector(20,5);
		/* arr.add(null); */
		arr.add("Gaurav");
		arr.add("Aaurav");
		arr.add("Baurav");
		arr.add("Gaurav");
		arr.add("Aaurav");
		arr.add("Baurav");
		arr.add("Gaurav");
		arr.add("Aaurav");
		arr.add("Baurav");
		arr.add("Gaurav");
		arr.add("Aaurav");
		arr.add("Baurav");
		arr.add("Gaurav");
		arr.add("Aaurav");
		arr.add("Baurav");
		arr.add("Gaurav");
		arr.add("Aaurav");
		arr.add("Baurav");
		arr.add("Gaurav");
		arr.add("Aaurav");
		arr.add("Baurav");
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.capacity());
		
	}

}
