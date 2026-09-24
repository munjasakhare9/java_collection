package com.demo.collection.set.treeset.comparator;

import java.util.TreeSet;

public class MainClass {
	public static void main(String args[]) {
		TreeSet<Student> t=new TreeSet<>(new StudentByNameAsc());
		t.add(new Student(10, "raj", "pune", 90.20));
		t.add(new Student(10, "naman", "nashik", 91.20));
		t.add(new Student(10, "rani", "mumbai", 95.20));
		t.add(new Student(10, "bhanu", "delhi", 98.20));
		t.add(new Student(10, "rudra", "nagpur", 99.20));
		
		for(Student s:t) {
			System.out.println(s);
		}
	}
}
