package task_22_02;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashEx7 {
	public static void main(String[] args) {
		HashMap<Integer, String> hash= new HashMap<>();
		hash.put(101,"Gaurav");
		hash.put(102, "Sunil");
		hash.put(104,"Radhe");
		hash.put(105,"Abhay");
		hash.put(106, "Monu");
		hash.put(107,"Sonu");
		System.out.println(hash);
		
		Map<Integer, String> map=Sorted(hash);
		System.out.println(map);
		
	}

	private static HashMap<Integer, String> Sorted(HashMap<Integer, String> hash) {
		List list=new LinkedList<>(hash.entrySet());
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Comparable st1 = (Comparable) ((Map.Entry)o1).getValue();
				Comparable st2 = (Comparable) ((Map.Entry) o2).getValue();
				return st1.compareTo(st2);
			}
		});
		HashMap newmap=new LinkedHashMap();
		Iterator it=list.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String>m1 =(Map.Entry) it.next();
			newmap.put(m1.getKey(),m1.getValue());
		}
		
		
		return newmap;
	}

}
