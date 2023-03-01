package task_core_java;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=1;
		for (int i = 1; i <= num; i++) {
			for (int j =1; j<=i; j++) {
				System.out.print(j);	
			}
			System.out.println("");
		}

	}

}
