package task_core_java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Leetcode6 {

	public String Solutions(String[] arry) {
		Arrays.sort(arry);
		String st1=arry[0];
		String st2=arry[arry.length-1];
		int ind=0;
		while(ind<st1.length() && ind < st2.length()) {
			if(st1.charAt(ind)==st2.charAt(ind)) {
				ind++;
			}else {
				break;
			}
			
		}
		return st1.substring(0,ind);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] arry=new String[3];
		for (int i = 0; i < arry.length; i++) {
			arry[i]=sc.next();
		}
		Leetcode6 lt=new Leetcode6();
		System.out.println(lt.Solutions(arry));
		

	}

}
