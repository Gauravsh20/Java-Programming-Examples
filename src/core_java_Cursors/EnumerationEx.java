package core_java_Cursors;

import java.util.Enumeration;
import java.util.Vector;


public class EnumerationEx{

	public static void main(String[] args) {
		Vector<Integer> vi=new Vector<>();
		vi.addElement(12);
		vi.addElement(23);
		Enumeration<Integer> em=vi.elements();
		while (em.hasMoreElements()) {
			Integer integer = (Integer) em.nextElement();
			if(integer==12) {
				System.out.println("Found No.12");
			}
			else {
				System.out.println("Not Found--"+ integer);
			}
		}
		
	}



}
