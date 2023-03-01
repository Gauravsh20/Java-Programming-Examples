package core_java_Map;

import java.util.HashMap;
import java.util.Map;

public class MappingEx1 {
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<>();
		System.out.println(mp.put(101, "Radhe"));
		System.out.println(mp.put(102, "Shayam"));
		System.out.println(mp.put(103, "Sita"));
		System.out.println(mp.put(101, "Geeta"));
		System.out.println(mp);
		Map<Integer, String> nmp=new HashMap<>();
		nmp.putAll(mp);
		System.out.println(nmp);
		
	}

}
