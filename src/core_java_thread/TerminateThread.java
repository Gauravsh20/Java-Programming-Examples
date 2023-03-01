package core_java_thread;

import java.io.IOException;

class Terminattest extends Thread{

	boolean stop=false;
	public void run() {
		 for (int i=1; i<=1000;i++) {
			 System.out.println(i);
			 try {
				sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(stop) 
				 
				 return;
		 }
	 }
 }
public class TerminateThread {
	public static void main(String[] args) throws IOException, InterruptedException {
			Terminattest ts=new Terminattest();
			Thread td=new Thread(ts);
			td.start();
			System.in.read();
			ts.stop=true;
			System.out.println("Hello");
			
	}

}
