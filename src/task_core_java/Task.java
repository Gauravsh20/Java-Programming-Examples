package task_core_java;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] astr=str.split(" ");
		int a=sc.nextInt();
		if(a<=str.length()-1) {
			String nst=astr[a];
			System.out.println(nst);
			String rst="";
			for(int i=nst.length()-1;i>=0;i--) {
				rst=rst+nst.charAt(i);
			}
			System.out.println(rst);
		}else {
			System.out.println("Invalid");
		}
		
	}

}
