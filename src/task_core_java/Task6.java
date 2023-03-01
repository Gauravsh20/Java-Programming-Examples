package task_core_java;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of row's---");
			int num=sc.nextInt();
			for (int i = 1; i <= num; i++) {  
				/* int n = num*2 */;  
					for (int j = 1; j<= num - i; j++){   
							System.out.print(" ");   
						}   
		
					for (int k = i; k >= 1; k--){  
							System.out.print("*");  
						}  
					
					for (int l = 2; l <= i; l++){  
							System.out.print("*");   
						}
					
						System.out.println();   
		    }   
		
			}
	}