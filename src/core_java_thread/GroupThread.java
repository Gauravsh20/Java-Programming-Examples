package core_java_thread;

public class GroupThread {
		  public static void main(String[] args) {
		    ThreadGroup groupA = new ThreadGroup("Group A");
		    ThreadGroup groupB = new ThreadGroup("Group B");
		  
		    Thread t1 = new Thread(groupA, () -> {
		      System.out.println("Thread 1 in Group A");
		    });
		    Thread t2 = new Thread(groupA, () -> {
		      System.out.println("Thread 2 in Group A");
		    });
		    Thread t3 = new Thread(groupB, () -> {
		      System.out.println("Thread 3 in Group B");
		    });
		  
		    t1.start();
		    t2.start();
		    t3.start();
		  
		    System.out.println("Number of threads in Group A: " + groupA.activeCount());
		    System.out.println("Number of threads in Group B: " + groupB.activeCount());
		  }
		}

