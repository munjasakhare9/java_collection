package com.demo.collection.sorting.userdefinedobject;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int rank;

	public Student(int id, String name, int rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}

	public int compareTo(Student s) {
		// return this.id - s.id;// 1--->

		// 2---> return name.compareTo(s.name);

		/*
		 * 3---> if(rank>s.rank) { return 1; } else if(rank<s.rank) { return -1; } else
		 * { return 0; }
		 */

		// 4---> return name.compareTo(s.name);

		return this.rank - s.rank;

	}

}
