package com.demo.collection.list.arraylist;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList(2);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.size());
		System.out.println(al);
		al.add(1000);
		al.add(1000);
		al.add(1000);
		al.add(1000);
		al.add(1000);
		System.out.println(al.size());
		System.out.println(al);
		
	}
}
