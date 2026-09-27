package com.demo.collection.set.treeset2;

import java.util.TreeSet;

public class Program1 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(17);
		ts.add(9);
		ts.add(7);
		ts.add(1);
		ts.add(3);
		
		System.out.println(ts);
		ts.add(65);
		System.out.println(ts);
	}
}
