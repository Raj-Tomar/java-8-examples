package com.java8_6.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {

		// Creating Streams
		// 1. Stream.of()
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream1.forEach(p -> System.out.println(p));

		// 2. Stream.of(array)
		Stream<Integer> stream2 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream2.forEach(p -> System.out.println(p));

		// 3. List.stream()
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream3 = list.stream();
		stream3.forEach(p -> System.out.println(p));

		// 4. Stream.generate() or Stream.iterate()
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);

		// 5. Stream of String chars or tokens
		IntStream stream5 = "12345_abcdefg".chars();
		stream5.forEach(p -> System.out.println(p));
		// OR
		Stream<String> s5 = Stream.of("A$B$C".split("\\$"));
		s5.forEach(p -> System.out.println(p));

		// Stream Collectors
		// 1. Collect Stream elements to a List
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list1.add(i);
		}
		Stream<Integer> stream6 = list1.stream();
		List<Integer> evenNumbersList = stream6.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);

		// 2. Collect Stream elements to an Array
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list2.add(i);
		}
		Stream<Integer> stream7 = list.stream();
		Integer[] evenNumbersArr = stream7.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);

		// Stream Operations

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		// Intermediate Operations
		// Stream.filter()
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

		// Stream.map()
		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

		// Stream.sorted()
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		// Terminal operations

		// Stream.forEach()
		memberNames.forEach(System.out::println);

		// Stream.collect()
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.print(memNamesInUppercase);

		// Stream.match()
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		// Stream.count()
		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
		System.out.println(totalMatched);

		// Stream.reduce()
		// The reduce() method performs a reduction on the elements of the stream with
		// the given function.
		// The result is an Optional holding the reduced value.
		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);

		// Stream Short-circuit Operations

		// Stream.anyMatch()
		boolean matched = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matched);

		// Stream.findFirst()
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();
		System.out.println(firstMatchedName);

	}
}
