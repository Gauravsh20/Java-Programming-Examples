package core_java_sets;

import java.util.TreeSet;

public class TreesetEx3 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		StringBuffer sbf=new StringBuffer("A");
		StringBuffer sbf2=new StringBuffer("X");
		StringBuffer sbf3=new StringBuffer("B");
		ts.add(sbf3);
		ts.add(sbf2);
		ts.add(sbf);
		ts.add(new StringBuffer("C"));
		ts.add(new StringBuffer("B"));
		ts.add(new StringBuffer("E"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("B"));
		System.out.println(ts);
		System.out.println("B".compareTo("E"));
		System.out.println(sbf3.compareTo(sbf));
		System.out.println(sbf3.compareTo(sbf3));
		
	}

}
