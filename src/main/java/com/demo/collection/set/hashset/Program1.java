package com.demo.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Program1 {
	public static void main(String[] args) {
//		HashSet<String> hs=new HashSet<>(10,0.75f);
		HashSet<String> hs=new HashSet<>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("one");
		hs.add(null);
		System.out.println(hs);
		hs.remove("three");
		System.out.println(hs);
		
		System.out.println("==========Iterator==========");
		Iterator<String> iterator=hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}
