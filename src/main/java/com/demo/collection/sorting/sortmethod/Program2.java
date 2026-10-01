package com.demo.collection.sorting.sortmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("C");
		al.add("y");
		al.add("nayan");
		al.add("nayak");
		al.add("mahesh");
		al.add("mahendra");

		System.out.println("Before sort : " + al);

		Collections.sort(al);

		System.out.println("After Sorting : " + al);

	}
}
