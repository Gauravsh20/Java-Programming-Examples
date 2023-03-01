package core_java_Feature8;

public class LamdaExpEx {
		public static void main(String[] args) {
			 
			  // old way
			  new Thread(new Runnable() {
			 
			   @Override
			   public void run() {
			    System.out.println("Thread is started");
			   }
			  }).start();
			 
			  // using lambda Expression
			  new Thread(()->System.out.println("Thread is started")).start();
			}
		
	}
