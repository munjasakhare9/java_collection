package com.demo.collection.list.arraylist3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App2 {
	public static void main(String args[]) {
		List<Student> al = new ArrayList<>();
		al.add(new Student(1, "Raju"));
		al.add(new Student(2, "John"));
		al.add(new Student(3, "Smith"));
		al.add(new Student(4, "Rani"));

		ListIterator<Student> listIterator = al.listIterator(al.size());
		System.out.println(listIterator.previous());
		
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		System.out.println("===========================================");

		for (int i = al.size() - 1; i >= 0; i--) {
			System.out.println(al.get(i));
		}
		
		System.out.println("===========================================");
		ListIterator<Student> li2 = al.listIterator();
		while(li2.hasNext()) {
			System.out.println(li2.next());
		}
	}
}
