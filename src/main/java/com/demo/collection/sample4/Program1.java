package com.demo.collection.sample4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Program1 {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<>(100);
		al.add(10);
		al.add(20);
		al.add(30);
		
		Set<Integer> set=new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(1000);
		al2.add(2000);
		al2.add(3000);
		al.addAll(set);
		al.addAll(al2);
		
		
		System.out.println(al);
	}
}
