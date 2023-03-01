package task_core_java;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
	    String s[] = st.split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans); 
	    }
	}