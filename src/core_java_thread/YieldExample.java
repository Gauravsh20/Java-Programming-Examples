package core_java_thread;

class Yield extends Thread{
	public void run() {
		Thread.yield();
		for (int i =1;i<=10;i++) {
			System.out.println(i+"--"+Thread.currentThread().getName());
		}
	}
	
}
public class YieldExample {
public static void main(String[] args) {
	Yield yd=new Yield();
	yd.start();
	Thread.currentThread().setName("Gaurav");
	for (int i =1;i<=10;i++) {
		System.out.println(i+"--"+Thread.currentThread().getName());
		
		}
	}
}
