package com.demo.collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class Program1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(null);
		lhs.add(40);
		
		System.out.println(lhs);
		
	}
}
