package com.java8_8.optional_class;

import java.util.Optional;

public class Test1 {

	public static void main(String[] args) {
		
		// Optional Class
		// Optional is a way of replacing a nullable T reference with a non-null value. 
		// An Optional may either contain a non-null T reference (in which case we say the reference is "present"), 
		// or it may contain nothing (in which case we say the reference is "absent").
		
		Optional<Integer> o1 = Optional.of(5);
		o1.isPresent(); // returns true
		o1.get(); // returns 5

		Optional<Integer> o2 = Optional.empty();
		o2.isPresent(); // returns false
		
		// Creating Optional objects
		Optional<Integer> o3 = Optional.empty(); 
		// Or
		Optional<Integer> o4 = Optional.of(5);
		// Or
		Optional<Integer> o5 = Optional.ofNullable(null);
		// System.out.println(o5.get()); // NoSuchElementException
		// or
		Optional<Integer> o6 = Optional.ofNullable(5);
		// System.out.println(o6.get()); // returns 5
		
		// Do something If Optional value is present
		o6.ifPresent(System.out::println);
		// Or we write as below:
		if(o6.isPresent()){
		    System.out.println(o6.get());
		}
	}
}
