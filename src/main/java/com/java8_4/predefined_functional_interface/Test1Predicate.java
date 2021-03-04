package com.java8_4.predefined_functional_interface;

import java.util.function.Predicate;

public class Test1Predicate {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i%2 == 0;
		System.out.println(p1.test(10));	// true
		System.out.println(p1.test(15));	// false
		
		// String length > 5
		String[] str = {"Aasdf", "Basdfasdf", "Casder", "Dzxcvert", "Easdvzxcv"};
		Predicate<String> p3 = s -> s.length() > 5;
		// Even length Strings
		Predicate<String> p4 = s -> s.length() % 2 == 0;
		for (String s : str) {
			if(p3.test(s)) {
				System.out.println(s);
			}
			if(p4.test(s)) {
				System.out.println(s);
			}
		}
	}
}
