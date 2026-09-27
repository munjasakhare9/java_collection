package com.demo.collection.list.arraylist3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class App3 {
	public static void main(String args[]) {
		List<Student> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		al.add(new Student(id, name));
		
		id=sc.nextInt();
		name=sc.next();
		al.add(new Student(id, name));
		
		id=sc.nextInt();
		name=sc.next();
		al.add(new Student(id, name));
		
		id=sc.nextInt();
		name=sc.next();
		al.add(new Student(id, name));
		
		ListIterator li=al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
}
