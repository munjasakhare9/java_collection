package com.demo.collection.sorting.sortmethod;

import java.util.ArrayList;
import java.util.Collections;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println("Before Sort : " + al);
		
		//sort the collection
		Collections.sort(al);

		System.out.println("After Sort : " + al);
		
		//reverse the collection
		Collections.reverse(al);
		
		System.out.println("After Reverse : "+al);
	}
}
