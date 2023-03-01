package core_java_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx1 {
	public static void main(String[] args) {
		Queue qu=new PriorityQueue<>();
		qu.offer("Ankur");
		qu.offer("Mohan");
		qu.offer("Raju");
		qu.offer("Sonu");
		qu.offer("Ankit");
		qu.offer("Monu");
		qu.offer("Sunil");
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.poll());
	}

}
