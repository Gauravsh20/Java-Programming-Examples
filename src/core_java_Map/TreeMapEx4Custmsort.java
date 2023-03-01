package core_java_Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx4Custmsort {
	public static void main(String[] args) {
		TreeMap map=new TreeMap<>(new Mycostum());
		map.put("AAA",101);
		map.put("ZZZ",103);
		map.put("LLL",104);
		map.put("YYY",105);
		System.out.println(map);
	}

}
class Mycostum implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String st1=o1.toString();
		String st2=o2.toString();
		return -st1.compareTo(st2);
	}
	
}