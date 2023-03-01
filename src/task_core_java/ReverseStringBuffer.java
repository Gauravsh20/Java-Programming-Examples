package task_core_java;

import java.util.Scanner;

public class ReverseStringBuffer {
	public static void main(String[] args) {
		/* String st="Go India Go"; */
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		StringBuffer sb=new StringBuffer(st);
		char[] nch=st.toCharArray();
		String nst="";
		for(int i=nch.length-1;i>=0;i--) {
			nst=nst+st.charAt(i);
			/* System.out.println(nst); */
		}
		System.out.println(nst);
		
		
		/* StringBuffer nst=sb.reverse(); System.out.println(nst); */
		 
		
	}

}
