package core_java_thread;
class Hii extends Thread{
	public void run() {
		for(int i=0;i<=500;i++) {	
			System.out.println("Hiiii......");
			Thread t=new Thread();
			try {
				t.sleep(1000);
			}catch (Exception e){
				
			}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=0;i<=500;i++) {
			System.out.println("Hello......");
			Thread t=new Thread();
			try {
				t.sleep(1000);
			}catch (Exception e){
				
			}
			
		}
	}
}
public class ThreadEx1 {
	public static void main(String[] args) {
		Hii hi=new Hii();
		Hello hlo=new Hello();
		hi.start();
		hlo.start();
		
	}

}
