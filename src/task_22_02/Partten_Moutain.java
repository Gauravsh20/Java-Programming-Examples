package task_22_02;

public class Partten_Moutain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int num=9;
		for (int i = 1; i <=num; i++) {
		for (int j =num; j >i; j--) {
			System.out.print(" ");
		}	
		for(int k=1;k<=i;k++) {
			System.out.print((i)+" ");
		}
		System.out.println();
		}

	}

}
