package core_java_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class HashMapEx2 {
	public static void main(String[] args) {
		Map map=new HashMap<>();
		map.put(1001,"A");
		map.put(1005,"E");
		map.put(1003,"C");
		map.put(1004,"B");
		Map map1=new HashMap<>();
		map1.put(1001,"A");
		map1.put(1002,"E");
		map1.put(1003,"C");
		map1.put(1004,"B");
		System.out.println(map);
		System.out.println(map1);
		System.out.println(map.containsKey(1003));
		System.out.println(map.equals(map1));
	}

}
