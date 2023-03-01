package task_21_02;

public class DeadLockEx3 {
	public static void main(String[] args) {
	final String st1="Gaurav";//resource-1
	final String st2="Yeshwanth";//resource-2
	
	Thread t1=new Thread(){
		public void run(){
			synchronized (st1) {
				System.out.println("Hello..."+st1);
				
			synchronized (st2) {
				System.out.println("Hiii..."+st2);
				
				
			}
			}
		}
		
	};
	Thread t2=new Thread(){
		public void run(){
			synchronized (st2) {
				System.out.println("Bye..."+st1);
			
			synchronized (st1) {
				System.out.println("Bye..."+st2);
				
				}
			}
		}
		
	};
	
	t1.start();
	t2.start();
	
	}

}
