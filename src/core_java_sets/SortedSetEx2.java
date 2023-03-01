package core_java_sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx2 {
	public static void main(String[] args) {
		TreeSet sort=new TreeSet<>();
		sort.add("A");
		sort.add("B");
		sort.add("C");
		sort.add("E");
		/* sort.add(new Integer(10)); */// Run time Error CCs
		sort.add(null);//null point exception Bcz null is add only emply treeset ,
						//not add which tree have added some elements
		System.out.println(sort);
	}


}
