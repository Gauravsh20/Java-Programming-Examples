package core_java_thread;
class Threadtest extends Thread{
	public void run() {
		System.out.println("Hello");
		Thread.currentThread().setName("Sharma");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}
public class CreateThread {
	public static void main(String[] args) {
		Threadtest t=new Threadtest();
		Thread.currentThread().setName("Gaurav"); //set name of the main thread
		System.out.println(Thread.currentThread().isAlive());
		t.start();
		
		/* System.out.println(10/0); */
	}

}
