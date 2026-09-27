package com.demo.collection.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorProgram1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(null);
		System.out.println(v);
		
		Enumeration elements=v.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
	}
}
