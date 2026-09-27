package com.demo.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program4 {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		//Approach-1
		System.out.println("=======for loop Approach=======");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//Approach-2
		System.out.println("=======for-each loop Approach=======");
		for(Object i: al) {
			System.out.println(i);
		}
		
		//Approach-3
		System.out.println("=======Iterator Approach=======");
		Iterator iterator=al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Approach-4
		System.out.println("=======ListIterator Approach=======");
		ListIterator listIterator=al.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		//Approach-5
		System.out.println("=======forEach() Approach=======");
		al.forEach((i)->{
			System.out.println(i);
		});
	}
}
