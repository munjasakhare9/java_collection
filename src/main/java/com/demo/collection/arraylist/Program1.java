package com.demo.collection.arraylist;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(true);
		al.add("raj");
		al.add(50.20);
		al.add(20);
		al.add(2,200);
		al.add(0,400);
		al.add(7,500);
		System.out.println(al);
		
		System.out.println("size :: before remove "+al.size());
		al.remove(0); 
		System.out.println("size :: after remove "+al.size());
		System.out.println(al);
	}
}
