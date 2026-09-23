package com.demo.collection.sample2;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		int arr[]=new int[10];
		arr[0]=100;
		arr[1]=200;
		arr[9]=300;
		
		System.out.println(Arrays.toString(arr));
		
		
		Student s[]=new Student[20];
		
		s[0]=new Student(10,"Raju");
		s[1]=new Student(11,"Rani");
		s[3]=new Student(15,"Rajesh");
		s[4]=new Student(16,"Gita");
		System.out.print(Arrays.toString(s));
		for(Student i: s) {
			System.out.println(i);
		}
	}
}
