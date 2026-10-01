package com.demo.collection.queue.priorityqueue;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("one");
		ad.add("two");
		ad.add("three");
		
		System.out.println(ad);
		
		ad.pollFirst();
		System.out.println(ad);
		
		ad.pollLast();
		System.out.println(ad);
		
		ad.addFirst("ashok");
		System.out.println(ad);
		ad.addLast("punit");
		System.out.println(ad);
	}
}
