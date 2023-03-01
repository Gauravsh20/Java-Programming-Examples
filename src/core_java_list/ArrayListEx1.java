package core_java_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		ArrayList arr=new ArrayList<>();
		ArrayList arr2=new ArrayList<>();
		/* arr.add(null); */
		arr.add("Gaurav");
		arr.add("Aaurav");
		arr.add("Baurav");
		/*
		 * arr.add(12); arr.add(12.12);
		 */
		System.out.println(arr);
		arr2.add(1);
		arr2.add(23);
		arr2.add(12);
		arr2.add(4);
		arr2.add(2);
		System.out.println(arr2);
		Collections.sort(arr);
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
	}

}
