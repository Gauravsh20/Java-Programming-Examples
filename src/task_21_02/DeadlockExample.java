package task_21_02;

public class DeadlockExample {
		   public static void main(String[] args) {
		      // Two objects for synchronization
		      Object lock1 = new Object();
		      Object lock2 = new Object();
		 
		      // Thread 1 locks on lock1, then tries to lock on lock2
		      Thread t1 = new Thread(new Runnable() {
		         @Override
		         public void run() {
		            synchronized (lock1) {
		               System.out.println("Thread 1: Locked on lock1");
		               try {
		                  Thread.sleep(1000);
		               } catch (InterruptedException e) {
		                  e.printStackTrace();
		               }
		               synchronized (lock2) {
		                  System.out.println("Thread 1: Locked on lock2");
		               }
		            }
		         }
		      });
		 
		      // Thread 2 locks on lock2, then tries to lock on lock1
		      Thread t2 = new Thread(new Runnable() {
		         @Override
		         public void run() {
		            synchronized (lock2) {
		               System.out.println("Thread 2: Locked on lock2");
		               try {
		                  Thread.sleep(1000);
		               } catch (InterruptedException e) {
		                  e.printStackTrace();
		               }
		               synchronized (lock1) {
		                  System.out.println("Thread 2: Locked on lock1");
		               }
		            }
		         }
		      });
		 
		      // Start the threads
		      t1.start();
		      t2.start();
		   }
		}
