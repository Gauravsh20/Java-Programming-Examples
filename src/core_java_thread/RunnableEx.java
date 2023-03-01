package core_java_thread;
class RunEx implements Runnable{
	public void run(){
		for(int i=0;i<=5;i++) {	
			System.out.println("Hiiii......");
			Thread t=new Thread();
			try {
				t.sleep(1000);
			}catch (Exception e){
				
			}
		}
	}
}
class RunEx2 extends RunEx {
	public void run() {
		for(int i=0;i<=5;i++) {	
			System.out.println("Hello......");
			Thread t=new Thread();
			try {
				t.sleep(1000);
			}catch (Exception e){
				
			}
		}
	}
}
public class RunnableEx {
	public static void main(String[] args) {
		 RunEx2 rx=new RunEx2();
		 RunEx rx2=new RunEx();
		 Thread th2=new Thread(rx2);
		 Thread th=new Thread(rx);
		 th.start();
		 th2.run();
	}

}
