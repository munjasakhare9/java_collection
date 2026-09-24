package com.demo.collection.sample4;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	public static void main(String args[]) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		List l2=new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(4000);
		l2.retainAll(l);
		System.out.println(l);
		System.out.println(l2);
	}
}
