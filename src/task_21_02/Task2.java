package task_21_02;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Please enter how many Element's insert in the Array?");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int sum = 0;
		int[] arr=new int[no];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
			
		}
		System.out.println("\nSum of all the elements is :" + sum);
	}

}
