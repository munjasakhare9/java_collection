package com.demo.collection.sorting.userdefinedobject;

public class Student {
	private int id;
	private String name;
	private int rank;
	
	public Student(int id, String name, int rank) {
		this.id=id;
		this.name=name;
		this.rank=rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
	
}
