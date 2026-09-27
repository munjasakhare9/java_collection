package com.demo.collection.list.arraylist3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Student> al=new ArrayList<>();
		al.add(new Student(1, "Raju"));
		al.add(new Student(2, "John"));
		al.add(new Student(3, "Smith"));
		al.add(new Student(4, "Rani"));
		
		Iterator<Student> iterator=al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		/*
		 * for(Student s: al) { System.out.println(s); }
		 */
	}
}
