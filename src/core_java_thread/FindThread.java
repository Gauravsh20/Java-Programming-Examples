package core_java_thread;

class FindThreadTest{
	public void m1() {
		System.out.println("Radhe");
		Thread thread=Thread.currentThread(); 
		System.out.println(thread);
		System.out.println(thread.getName());
	}
}
public class FindThread {
	public static void main(String[] args) {
		System.out.println("Let us find current Thread");
		FindThreadTest ft=new FindThreadTest();
		ft.m1();

	}

}
