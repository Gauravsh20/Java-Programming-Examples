package core_java_thread;
class Proiroitiestest extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		System.out.println("Assign a Name  "+Thread.currentThread().getName());
		System.out.println("Proiroties a Name  "+Thread.currentThread().getPriority());
	}
	
}
public class Priorities {
	public static void main(String[] args) {
		Proiroitiestest pt=new Proiroitiestest();
		Proiroitiestest pt1=new Proiroitiestest();
		
		Thread td=new Thread(pt,"Gaurav");
		Thread td1=new Thread(pt1,"Sharma");
		td.setPriority(3);
		td1.setPriority(4);
		td.start();
		td1.start();
		
		
	}

}
