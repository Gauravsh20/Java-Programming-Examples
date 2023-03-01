package Core_java_String;

public class StringBufferThreadsafe {
	public static void main(String[] args) {
		// create a StringBuffer object
		StringBuffer sb = new StringBuffer();

		// create two threads that modify the StringBuffer
		Thread t1 = new Thread(() -> {
		    for (int i = 0; i < 100; i++) {
		        sb.append("a");
		    }
		});

		Thread t2 = new Thread(() -> {
		    for (int i = 0; i < 100; i++) {
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

		// print the final contents of the StringBuffer
		System.out.println(sb.toString()); // prints "aaaaaaaaaabbbbbbbbbb"

	}
}
