package core_java_sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestDuplicate {
	public static void main(String[] args) {
		Set<String> st=new HashSet<>();
		st.add("Hello");
		st.add("hello");
		st.add("Hello");
		Iterator<String> it=st.iterator();
		while (it.hasNext()) {
			int string =  it.next().hashCode();
			System.out.println(string);
			
		}
	}

}
