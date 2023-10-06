package ex11;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

import lombok.AllArgsConstructor;

public class LinkedListQueun {
	
	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
		Queue<String> queue = new LinkedTransferQueue<String>();
		
		queue.add("Toy");
		queue.offer("Box");
		queue.offer("Robot");
		queue.offer("Toy");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("-----------------------");
		for(String s : queue)
			System.out.println(s);
		
		System.out.println(queue.peek());
	}

}
