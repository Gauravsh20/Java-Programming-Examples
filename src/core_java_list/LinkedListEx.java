package core_java_list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		list.add(12);
		list.add("Gaurav");
		list.add(null);
		list.add(12.29);
		
		System.out.println(list);
		
		Object[] obj=list.toArray();
		//System.out.println(obj);
		//System.out.println(vs);
		//System.out.println(vs.getClass().getSimpleName());
		

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < obj.length; i++) {
            	if("Integer"==obj[i].getClass().getSimpleName()) {
            		System.out.println("Integer Number Print"+obj[i]);
            	}
            }
        });
        
        t1.start();
			
	}
}

