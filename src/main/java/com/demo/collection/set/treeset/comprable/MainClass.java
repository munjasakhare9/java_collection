package com.demo.collection.set.treeset.comprable;

import java.util.TreeSet;

public class MainClass {
	public static void main(String args[]) {
		
		TreeSet<Student> t=new TreeSet<>();
		t.add(new Student(10, "Ram", 82.90));
		t.add(new Student(11, "Gita", 90.60));
		t.add(new Student(12, "Sham", 95.70));
		t.add(new Student(13, "Yash", 90.00));
		
		for(Student s:t) {
			System.out.println(s);
		}
	}
}
