package com.demo.collection.sample4;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		l.add(0,500);
		System.out.println(l);
		l.set(3, 50);
		System.out.println(l);
		System.out.println(l.contains(10));
		System.out.println(l.get(-1));
	}
}
