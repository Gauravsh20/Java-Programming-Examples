package task_21_02;

public class SyncroEx1 {
	public static void main(String[] args) {
		custom cm=new custom();
		Thread t1=new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				cm.increment();
			}
			
		});
		Thread t2=new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				cm.increment();
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Count: " + cm.getNum());
	}

}
class custom{
	private int num=0;
	public synchronized void increment() {
		num++;
	
	}
	public synchronized int getNum() {
		
		return num;
	}
	
}
