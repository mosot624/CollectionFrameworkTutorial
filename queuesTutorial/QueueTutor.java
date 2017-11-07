package queuesTutorial;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTutor {

	public static void main(String[] args) {
		/*
		 * Start of the queue is called a head, end of the queue is called a
		 * tail. It works in a FIFO system: first in, first out.
		 */

		Queue<Integer> que1 = new ArrayBlockingQueue<Integer>(3);
		// Throws an exception because there's not item in the queue yet.
		// System.out.println("Head of the queue is: "+ que1.element());

		que1.add(5);
		que1.add(2);
		que1.add(11);

		System.out.println("Head of the queue is: " + que1.element());
		try {
			que1.add(15);

		} catch (IllegalStateException e) {
			System.out.println("To many elements in the queue");
		}

		for (Integer valueLoop : que1) {
			System.out.println(valueLoop);
		}

		Integer value;
		// removes the head of the queue
		System.out.println("Removed from que: " + que1.remove());
		System.out.println("Removed from que: " + que1.remove());
		System.out.println("Removed from que: " + que1.remove());
		try {
			System.out.println("Removed from que: " + que1.remove());

		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}

		/////// New queue object///////////

		Queue<Integer> que2 = new ArrayBlockingQueue<Integer>(2);

		System.out.println("Queue2 peek: " + que2.peek());

		que2.offer(5);
		que2.offer(2);

		if (que2.offer(30) == false) {
			System.out.println("Offer failed to add third item");
		}
		que2.offer(11);

		for (Integer valueLoop : que2) {
			System.out.println("Queue 2 value: " + valueLoop);
		}

		System.out.println("Queue 2 poll: " + que2.poll());
		System.out.println("Queue 2 poll: " + que2.poll());
		System.out.println("Queue 2 poll: " + que2.poll());

	}

}
