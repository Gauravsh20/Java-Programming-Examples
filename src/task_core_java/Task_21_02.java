package task_core_java;

import java.util.Scanner;

public class Task_21_02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of row's");
		int num= sc.nextInt();
		int count = 1; 
		
		for (int i = 1; i <= num; i++) { 
			for (int j = num; j > i; j--)
        {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++)
        {
            System.out.print((i) + " ");
        }
        System.out.println();
        
		}
	}

}
