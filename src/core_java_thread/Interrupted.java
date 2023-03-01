package core_java_thread;
class Intrtest  extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class Interrupted{
	public static void main(String[] args) {
	    new Intrtest().start();
	    System.out.println(Intrtest.interrupted());
	    
	}

}
