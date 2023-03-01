package task_21_02;

public class SynchronizedExample {
	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Count: " + counter.getCount());
	}
}

class Counter {
	private int count;

	public synchronized void increment() {
		count++;
	}

	public synchronized int getCount() {
		return count;
	}
}
