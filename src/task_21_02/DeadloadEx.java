package task_21_02;

class Demo1{
		public void printint(int a) {
			for (int i = 1000; i> 0; i--) {
				System.out.println(a);
				}
	}
}

public class DeadloadEx extends Demo1{
	int a;
	public static void main(String[] args) {
		Demo1 d1= new DeadloadEx();
		Demo1 d2= new Demo1();
		d1.printint(96);
		d2.printint(150);;
	}

}
