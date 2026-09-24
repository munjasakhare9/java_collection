package com.demo.collection.set.treeset.comparator;

import java.util.Comparator;

import java.util.Comparator;

public class Student{
	private int id;
	private String name;
	private String city;
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
	
	public void setCity() {
		this.city=city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setPercentage(double percentage) {
		this.percentage=percentage;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public Student(int id, String name, String city, double percentage) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.percentage=percentage;
	}
	
	public String toString() {
		return "Student[id = "+id+", name = "+name+", city="+city+", percentage = "+percentage+"]";
	}
}
