package com.java8_5.double_colon_operator;

public class Test3ConstructorReference {

	public static void main(String[] args) {
		MyInterface2 i = Sample::new;
		// Here MyInterface get() method refers to Sample class Constructor
		Sample s = i.get();
	}
}

class Sample {
	Sample() {
		// statements
		System.out.println("Sample Class Constructor");
	}
}