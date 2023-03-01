package core_java_list;

import java.util.Stack;

public class StackExp {
	public static void main(String[] args) {
		Stack st=new Stack<>();
		st.add(12);
		st.push(122);
		st.push(122);
		System.out.println(st);
		
		
		  st.pop(); 
		  st.remove(1);
		 
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search(122));
	}

}
