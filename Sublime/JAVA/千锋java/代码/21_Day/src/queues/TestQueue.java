package queues;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TestQueue {

	public static void main(String[] args) {

//		Queue q = new LinkedList();
		Queue q = new ConcurrentLinkedQueue();
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
	}

}
