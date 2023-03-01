package task_22_02;
public class DeadlockTask {
	public static void main(String[] args) {
		final String st1="Gaurav";
		final String st2="Rohan";
		
		Thread t1=new Thread(){
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (st1) {//t1
				System.out.println("Hello....."+st1);
				synchronized (st2) {
					System.out.println("Hiii...."+st2);
					}
				}
			}
			
		};
		Thread t2=new Thread(){
			public void run() {
				synchronized (st2) {//t2
				System.out.println("Bye....."+st1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (st1) {
					System.out.println("Bye...."+st2);
					}
				}
			}
			
		};
		t1.start();
		t2.start();
		
	}

}
