package Core_java_String;

public class StringBuilderNotsafe {
	public static void main(String[] args) {
		// create a StringBuilder object
		StringBuilder sb = new StringBuilder();

		// create two threads that modify the StringBuilder
		Thread t1 = new Thread(() -> {
		    for (int i = 0; i < 10; i++) {
		        sb.append("a");
		    }
		});

		Thread t2 = new Thread(() -> {
		    for (int i = 0; i < 10; i++) {
		        sb.append("b");
		    }
		});

		// start the threads
		t1.start();
		t2.start();

		// wait for the threads to finish
		try {
		    t1.join();
		    t2.join();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

		// print the final contents of the StringBuilder
		System.out.println(sb.toString()); // prints a mix of "a" and "b" characters in an unpredictable order

	}
}
