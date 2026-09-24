package com.demo.collection.set.treeset.comprable;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double percentage;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPercentage(double percentage) {
		this.percentage=percentage;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public Student(int id, String name, double percentage) {
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	
	public Student() {
		super();
	}
	
	public String toString() {
		return "Student[id = "+id+", name = "+name+", percentege = "+percentage+"]";
	}

	@Override
	public int compareTo(Student o) {
		/*
		 * if(id>o.id) { return 1; } else if(id<o.id) { return -1; } else { return 0; }
		 */
		return name.compareTo(o.name);
	}
}
