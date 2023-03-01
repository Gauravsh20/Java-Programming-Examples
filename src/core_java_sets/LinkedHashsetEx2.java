package core_java_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetEx2 {

	public static void main(String[] args) {
		HashSet list= new HashSet();
		list.add("B");
		list.add("A");
		list.add("Guarav");
		list.add(null);
		list.add("C");
		list.remove("B");
		list.add(11);
		list.add(44);
		System.out.println(list.add(12));
		System.out.println(list);
		System.out.println(list.spliterator().SORTED);
		
	}

}
