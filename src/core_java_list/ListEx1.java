package core_java_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListEx1 {
	public static void main(String[] args) {
		
		List list=new ArrayList<>();
		List list1=new ArrayList<>();
		list.add("A");
		list.add(12);
		list.add("Gaurav Sharma");
		list.add(12.9);
		list.add(true);
		list.add("Gaurav");
		list1.add("A");
		list1.add(12);
		list1.add("Gaurav Sharma");
		list1.add(12.9);
		list1.add(true);
		list1.add("Gaurav");
		System.out.println(list);
		System.out.println(list1);
		
		ListIterator listint=list.listIterator();
		while(listint.hasNext()) {
			if(list.equals(list1)) {
				System.out.println("radhe");
			}
			System.out.println(listint.next());
		}
	}

}
