package com.java8_2.functional_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(25);
		list.add(5);
		list.add(0);
		list.add(30);
		list.add(15);
		System.out.println(list); // Output will print in same order within [].
		
		Collections.sort(list, new MyComparator());
		System.out.println(list); // Output will be sorted in ascending order.

		// Convert to Lamda Expression
		// Remove MyComparator class
		Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
		Collections.sort(list, c);
		System.out.println(list);

		// Print 1 by 1 element
		list.stream().forEach(System.out::println);

		// Even number from list
		List<Integer> l = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l);
	}
}

class MyComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
	}
}