package core_java_list;
import java.util.Vector;

public class VectorExample {
	    public static void main(String[] args) throws InterruptedException {
	        Vector<Integer> numbers = new Vector<>();
	        numbers.add(1);
	        numbers.add(2);

	        Thread t1 = new Thread(() -> {
	            numbers.add(3);
	        });

	        Thread t2 = new Thread(() -> {
	            numbers.set(1, 4);
	        });

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println(numbers);
	    }
	}
