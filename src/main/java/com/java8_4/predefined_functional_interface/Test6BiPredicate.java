package com.java8_4.predefined_functional_interface;

import java.util.function.BiPredicate;

public class Test6BiPredicate {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p = (a,b) -> (a+b) % 2 == 0;
		System.out.println(p.test(10,20));	// Output true
		System.out.println(p.test(15,20));	// Output false
	}
}
