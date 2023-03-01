package task_21_02;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class HashMapDefaultsorting {
	public static void main(String[] args) {
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		hash.put("Gaurav", 101);
		hash.put("Sohan", 103);
		hash.put("Mohan", 104);
		hash.put("Raju", 105);
		hash.put("Gopal", 107);
		hash.put("Sunil", 108);
		hash.put("Sourabh", 102);

		System.out.println(hash);
		
		Set set=hash.entrySet();
		//System.out.println(set);
		Map<String, Integer>map=sortedvalue(hash);
		System.out.println(map);
		
	}

	private static HashMap<String, Integer> sortedvalue(HashMap hash) {
		List list=new LinkedList(hash.entrySet());
		//System.out.println(list);
		Collections.sort(list, new Comparator()   
			{  
				public int compare(Object o1, Object o2)   
			{  
		return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());  
		}  
		});
		HashMap sortedHashMap = new LinkedHashMap();  
		for (Iterator it = list.iterator(); it.hasNext();)   
		{  
		 Map.Entry entry = (Map.Entry) it.next();  
		sortedHashMap.put(entry.getKey(), entry.getValue());  
		}
		return sortedHashMap; 
	}

}

