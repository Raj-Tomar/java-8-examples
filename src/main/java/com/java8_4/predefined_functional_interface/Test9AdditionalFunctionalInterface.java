package com.java8_4.predefined_functional_interface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Test9AdditionalFunctionalInterface {

	public static void main(String[] args) {

		int x[] = { 0, 5, 10, 15, 20 };
		Predicate<Integer> p1 = i -> i % 2 == 0;
		for (int i : x) {
			if (p1.test(i)) {
				System.out.println(i);
			}
		}

		IntPredicate p2 = i -> i % 2 == 0;
		// There is not autoboxing will be performed with IntPredicate.
		for (int i : x) {
			if (p2.test(i)) {
				System.out.println(i);
			}
		}
		
		// Primitive Function
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));
		// Convert to Primitive Function
		IntFunction<Integer> f2 = i -> i * i;
		System.out.println(f2.apply(4));
		
		Function<String, Integer> f3 = s -> s.length();
		System.out.println(f3.apply("Raj"));
		// Convert to Primitive Function
		ToIntFunction<String> f4 = s -> s.length();
		System.out.println(f4.applyAsInt("Raj"));
		
		Function<Integer, Double> f5 = i -> Math.sqrt(i);
		System.out.println(f5.apply(7));
		
		IntToDoubleFunction f6 = i -> Math.sqrt(i);
		System.out.println(f6.applyAsDouble(7));
		
		
		// UnaryOperator :
		
		Function<Integer, Integer> f7 = i -> i * i;
		//Alternate of this Function:
		// If Input and Output are User defined object the go for below UnaryOperator.
		UnaryOperator<Integer> f8 = i -> i * i;
		System.out.println(f8.apply(4));
		
		// To Enhance performance of above UnarayOperator, Go for IntUnaryOperator.
		IntUnaryOperator f9 = i -> i * i;
		System.out.println(f9.applyAsInt(4));
		
		
		// BinaryOperator:
		
		BiFunction<String, String, String> f10 = (s1, s2) -> s1 + s2;
		System.out.println(f10.apply("Raj", "Tomar"));
		// For This we can go for BinaryOperator
		BinaryOperator<String> b = (s1, s2) -> s1 + s2;
		System.out.println(b.apply("Raj", "Tomar"));
		
		BinaryOperator<Integer> b1 = (i1, i2) -> i1 * i2;
		System.out.println(b1.apply(10, 20));
		
		// We can go for Primitive Binary Operator
		IntBinaryOperator b2 = (i1, i2) -> i1 * i2;
		System.out.println(b2.applyAsInt(10, 20));
		
	}
}
