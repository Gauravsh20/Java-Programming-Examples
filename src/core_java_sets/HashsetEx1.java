package core_java_sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx1 {
	public static void main(String[] args) {
		//create the Hashset...
		HashSet<String> hs=new HashSet<>();
		hs.add("Gaurav");              // add method
		hs.add("Sharma");
		hs.add("Raju");
		hs.add("Sohan");
		
		HashSet<String> hs2=new HashSet<>();
		hs2.addAll(hs);                 //addAll method 
		hs2.add("sunil");
		hs2.add("Rakesh");
		hs2.add("Mohan");
		
		hs.remove("Sharma");			//Remove method
		
		/* hs.clear(); */					//clear method
		
		System.out.println(hs.contains("Gaurav"));	// check the element present or not?
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		System.out.println("Show the Hashset elements...");
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			String st=(String) it.next();
			System.out.println(st);
		}
		System.out.println("Show the  second Hashset elements...");
		Iterator it2=hs2.iterator();
		while(it2.hasNext()) {
			String st2=(String) it2.next();
			System.out.println(st2);
		}
	}

}
