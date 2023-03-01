package core_java_thread;
 class MultiTT implements Runnable{
	String st;
	MultiTT(String st) {
		this.st=st;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(st+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
 }
public class MultitaskMultithread {
	public static void main(String[] args) {
		MultiTT tt=new MultiTT("Seat No");
		MultiTT tt2=new MultiTT("Cut No");
		
		Thread td1=new Thread(tt);
		Thread td2=new Thread(tt2);
		td1.start();
		td2.start();
	}
}
