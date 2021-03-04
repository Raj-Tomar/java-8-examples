package com.java8_6.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {

		// Parallelism in Java Steam
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		// Here creating a parallel stream
		Stream<Integer> stream = list.parallelStream();

		Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);
		
		//	Stream Operations
		
		//	Intermediate Operations
		
		    	// filter()
		    	// map()
		    	// flatMap()
		    	// distinct()
		    	// sorted()
		    	// peek()
		    	// limit()
				// skip()
		
		//	Terminal Operations
		
			    // forEach()
			    // forEachOrdered()
			    // toArray()
			    // reduce()
			    // collect()
			    // min()
			    // max()
			    // count()
			    // anyMatch()
			    // allMatch()
			    // noneMatch()
			    // findFirst()
			    // findAny()

	}
}
