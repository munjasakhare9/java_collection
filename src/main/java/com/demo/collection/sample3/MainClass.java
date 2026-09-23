package com.demo.collection.sample3;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		Object[] obj=new Object[10];
		obj[0]=new Student(10,"Gita");
		obj[1]=new Student(11, "Jay");
		
		obj[3]=new Employee(1, "pavan", 50000.00);
		obj[4]=new Employee(2, "priya", 80000.20);
		
		obj[2]=new Student(20,"rohit");
		
		System.out.println(Arrays.toString(obj));
		
		for(Object o: obj) {
			System.out.println(o);
		}
		
		System.out.println("=====================================");
		
		for(int i=0;i<obj.length-6;i++) {
			System.out.println(obj[i]);
		}
		
		Student s=new Student(10,"yash");
		Object ob=new Object();
		System.out.println(ob.toString());
		System.out.println(s);
		
		System.out.println("======================================");
	}
}
