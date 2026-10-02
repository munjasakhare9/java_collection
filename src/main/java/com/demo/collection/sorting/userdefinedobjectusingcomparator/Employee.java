package com.demo.collection.sorting.userdefinedobjectusingcomparator;

public class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
