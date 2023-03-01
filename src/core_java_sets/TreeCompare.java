package core_java_sets;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeSet;

class Myorder implements Comparator{
	public int compare(Object obj1,Object obj2) {
		
		Integer int1=(Integer)obj1;
		Integer int2=(Integer)obj2;
		
		return -int1.compareTo(int2);//1st Method
		
		//2nd Method
		/*
		 * if(int1<int2) { return 1;
		 * 
		 * } else if(int1>int2){ return -1; } else { return 0; }
		 */
		
		
	}

}

public class TreeCompare {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new Myorder());
		ts.add(12);
		ts.add(13);
		ts.add(15);
		ts.add(1);
		ts.add(3);
		ts.add(5);
		ts.add(16);
		System.out.println(ts);
	}
}
