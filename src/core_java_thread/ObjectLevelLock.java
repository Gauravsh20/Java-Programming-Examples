package core_java_thread;
import java.io.*;
import java.util.*;

class Displays {

	// Declaring Non-static wish method
	public void wish(String name)
	{

		// synchronizing wish method
		// and getting the lock of current object
		synchronized (this)
		{

			for (int i = 1; i <= 10; i++) {

				System.out.print("Good Morning: ");


				try {

					// Putting thread on sleep for specified
					// time
					// using the sleep() method
					Thread.sleep(1000);
				}

				catch (InterruptedException e) {

					System.out.println(e);
				}
				System.out.println(name);
			}
		}
	}
}

class myThreads extends Thread {
	Displays d;
	String name;
	
	myThreads(Displays d, String name)
	{

		this.d = d;
		this.name = name;
	}

	public void run()
	{

		d.wish(name);
	}
}
public class ObjectLevelLock {


	public static void main(String[] args)
	{

		Displays d = new Displays();

		myThreads t1 = new myThreads(d, "Dhoni");
		myThreads t2 = new myThreads(d, "Yuvraj");

		t1.start();
		t2.start();
	}
}

