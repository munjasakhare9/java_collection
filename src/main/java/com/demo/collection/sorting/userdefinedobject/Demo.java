package com.demo.collection.sorting.userdefinedobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Student> al = new ArrayList<>();
		al.add(new Student(101, "John", 1));
		al.add(new Student(104, "Anil", 4));
		al.add(new Student(102, "Smith", 2));
		al.add(new Student(103, "Robert", 3));

		System.out.println(al);
		for (Student s : al) {
			System.out.println(s);
		}

		Collections.sort(al);
		
		System.out.println("-------------------------after sorted--------------------");
		System.out.println(al);
		for(Student s:al) {
			System.out.println(s);
		}
	}
}
