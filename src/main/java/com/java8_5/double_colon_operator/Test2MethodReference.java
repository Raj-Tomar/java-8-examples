package com.java8_5.double_colon_operator;

public class Test2MethodReference {

	public static void sum(int x, int y) {
		System.out.println("Sum : " + (x + y));
	}

	public static void main(String[] args) {
		MyInterface i = (a, b) -> System.out.println("Sum : " + (a + b));
		// Above line can be replaced as below
		MyInterface i1 = Test2MethodReference::sum;
		i1.add(10, 20);
	}

	
}
