package com.demo.collection.set.treeset.comparator;

import java.util.Comparator;

public class StudentByCityAsc implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}
