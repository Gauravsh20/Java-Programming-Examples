package task_21_02;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import core_java_Feature8.ForEachMethod;

public class HashMapSorting {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hash=new HashMap<>();
		hash.put(102,"Radhe");
		hash.put(103,"Shayam");
		hash.put(104,"Mohan");
		hash.put(101,"Ravi");
		hash.put(107,"Harshit");
		System.out.println(hash);
		
		Map<Integer, String>map=Sortedvalue(hash);
		System.out.println(map);
		
		
	}

	private static HashMap<Integer, String> Sortedvalue(HashMap<Integer, String> hash) {
		
		List list=new LinkedList(hash.entrySet());
		System.out.println(list);
		Collections.sort(list, new Comparator() {
			public int compare(Object  o1, Object o2) {
				Comparable value1 = (Comparable) ((Map.Entry)o1).getValue();
				Comparable value2 = (Comparable) ((Map.Entry) o2).getValue();
				return value1.compareTo(value2);
				
			}
		});
		
		HashMap Sorted=new LinkedHashMap<>();
		Iterator it=list.iterator();
		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			Sorted.put(mp.getKey(), mp.getValue());
		}
		
		return Sorted;
	}

	

}
