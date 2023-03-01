package core_java_thread;

class Jointest extends Thread{
	static Thread mainthread;
	public void run() {
		try {
			mainthread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++) {
			System.out.println(i+""+Thread.currentThread().getName());
		}
	}
}
public class JoinExample extends Jointest{
	
	public static void main(String[] args) throws InterruptedException {
		Jointest jt=new Jointest();
		mainthread=Thread.currentThread();	
		jt.start();
		for(int i=1;i<=10;i++) {
			System.out.println(i +""+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		
	}

}
