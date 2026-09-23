package com.demo.collection.list.arraylist;

import java.util.ArrayList;

public class Program_01 {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);          // [10, 20, 30]
        System.out.println(list.get(1));   // 20

        list.set(1, 50);
        System.out.println(list);          // [10, 50, 30]

        list.remove(Integer.valueOf(50));
        System.out.println(list);          // [10, 30]

        System.out.println(list.contains(30)); // true
        System.out.println(list.size());       // 2
	}
}
