package com.demo.collection.list.arraylist3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class App4 {
	public static void main(String args[]) {
		List<Student> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String s="add";
		System.out.println("=====================Enter Data===================");
		while(!s.equals("exit")) {
			System.out.println("Ente Id :- ");
			int id=sc.nextInt();
			System.out.println("Ente Name :- ");
			String name=sc.next();
			System.out.println("Enter exit or add");
			s=sc.next();
			if(s.equals("add")) {
				al.add(new Student(id, name));
			}
			else {
				s="exit";
			}
		}
		
		System.out.println("=====================Print Data===================");
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		sc.close();
	}
}
