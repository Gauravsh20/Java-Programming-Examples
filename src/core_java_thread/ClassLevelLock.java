package core_java_thread;

//java program to illustrate Class Level Lock Concept

import java.io.*;
import java.util.*;

class Display {

	// Declaring static wish method
	public static void wish(String name)
	{

		// synchronizing wish method
		// and getting the lock of display class
		synchronized (Display.class)
		{

			for (int i = 1; i <= 10; i++) {

				// Display message only
				System.out.print("Good Morning: ");

				// Try block to check for exceptions
				try {
					// Putting thread on sleep for specified
					// time
					// using the sleep() method
					Thread.sleep(1000);
				}

				// Catch block to handle the exception
				catch (InterruptedException e) {

					// Throwing exception
					System.out.println(e);
				}
				// Display message
				System.out.println(name);
			}
		}
	}
}

//C;asss 2
//Helper Class (extends the Thread class)
//myThread with override the run method
//as per our requirements it also consists
//of parameterized constructor
class myThread extends Thread {

	Display d;
	String name;

	myThread(Display d, String name)
	{

		// This keyword refers to current object itself
		this.d = d;
		this.name = name;
	}

	// run method for thread/s
	public void run()
	{

		// Calling wish method of display class
		d.wish(name);
	}
}


public class ClassLevelLock {

	public static void main(String[] args)
	{
		Display d = new Display();

		myThread t1 = new myThread(d, "Dhoni");
		myThread t2 = new myThread(d, "Yuvraj");

		t1.start();
		t2.start();
	}
}

