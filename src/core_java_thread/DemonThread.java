package core_java_thread;

class DemanTest extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Hello Daemon");
		}else {
			System.out.println("Hello child");
		}
	}
}
public class DemonThread {
	public static void main(String[] args) {
		DemanTest dt=new DemanTest();
		dt.setDaemon(false);
		dt.start();
		System.out.println("Radhe Radhe");
		
	}

}
