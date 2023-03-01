package core_java_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(101,"Gaurav");
		hm.put(102,"Rahul");
		hm.put(103,"Sourabh");
		hm.put(104,"Sachin");
		hm.put(105,"Ankit");
		System.out.println(hm);
		System.out.println(hm.put(102,"Sonu"));
		System.out.println(hm);
		
		Set st=hm.keySet();
		System.out.println(st);
	
		Collection ct=hm.values();
		System.out.println(ct);
		Set set=hm.entrySet();
		System.out.println(set);
		Iterator it=set.iterator();
		while (it.hasNext()) {
			Map.Entry m1=(Map.Entry)it.next();
			System.out.println(m1.getKey()+"---"+m1.getValue()); 
			
		}
		
	}

}
