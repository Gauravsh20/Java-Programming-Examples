package core_java_sets;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {
	public static void main(String[] args) {
		SortedSet<Number> num=new TreeSet<>();
		num.add(12);
		num.add(3);
		num.add(34);
		num.add(11);
		
		Iterator<Number> it=num.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
