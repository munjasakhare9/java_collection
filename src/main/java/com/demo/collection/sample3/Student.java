package com.demo.collection.sample3;

public class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
