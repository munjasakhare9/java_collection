package com.demo.collection.set.hashset2;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		hs.add(new Student(1, "Raju"));
		hs.add(new Student(2, "Rani"));
		hs.add(new Student(3, "John"));
		
		Iterator iterator=hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
