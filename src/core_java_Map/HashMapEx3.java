package core_java_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapEx3 {
	public static void main(String[] args) {
		 TreeMap map= new TreeMap<>();
		 map.put(null,101);
		 System.out.println( map.put(1,103));
		 System.out.println(map.put(null,102));
		 System.out.println(map);
	}

}
