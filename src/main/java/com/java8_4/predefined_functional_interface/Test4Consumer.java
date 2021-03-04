package com.java8_4.predefined_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test4Consumer {

	public static void main(String[] args) {

		Consumer<String> c1 = str -> System.out.println(str);
		c1.accept("Some String");
		c1.accept("Any Other String");

		Function<Student, String> f4 = s -> {
			String grade = "";
			if (s.marks >= 80)
				grade = "A [Distinction]";
			else if (s.marks >= 60)
				grade = "B [First Class]";
			else if (s.marks >= 50)
				grade = "C [Second Class]";
			else if (s.marks >= 35)
				grade = "D [Third Class]";
			else
				grade = "E [Failed]";
			return grade;
		};

		Consumer<Student> c2 = s -> {
			System.out.println("Name : " + s.name);
			System.out.println("Marks : " + s.marks);
			System.out.println("Grade : " + f4.apply(s));
			System.out.println();
		};

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("A Student", 100));
		studentList.add(new Student("B Student", 65));
		studentList.add(new Student("C Student", 55));
		studentList.add(new Student("D Student", 45));
		studentList.add(new Student("E Student", 25));
		for (Student st : studentList) {
			c2.accept(st);
		}

		Predicate<Student> p = s -> s.marks > 60;
		for (Student st : studentList) {
			if (p.test(st)) {
				c2.accept(st);
			}
		}

		// Consumer Chaining:
		Consumer<Movie> c3 = m -> System.out.println("Ready to Release");
		Consumer<Movie> c4 = m -> System.out.println("Released and Very Successful");
		Consumer<Movie> c5 = m -> System.out.println("Storing into DB");
		Consumer<Movie> cc = m -> c3.andThen(c4).andThen(c5);

		Movie m = new Movie("Spider Man");
		cc.accept(m);
		// All 3 Consumer will be excecuted.
		// only andThen() method can be used.
	}
}

class Movie {
	String name;

	Movie(String name) {
		this.name = name;
	}
}
