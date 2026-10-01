package com.demo.collection.queue.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("john");
		queue.add("smith");
		queue.add("orlen");
		queue.add("charles");
		
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());		
		System.out.println("==============iterator===============");
		Iterator<String> iterator=queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("=================for remove object form queue==========");
		System.out.println(queue.remove());
		System.out.println(queue.poll()); //return and remove head element, if not present then return null
		System.out.println(queue);
		
		System.out.println("=================for add object in Queue================");
		System.out.println(queue.add("david"));
		System.out.println(queue.add("jack"));
		System.out.println(queue.offer("gita"));
		System.out.println(queue);
	}
}
