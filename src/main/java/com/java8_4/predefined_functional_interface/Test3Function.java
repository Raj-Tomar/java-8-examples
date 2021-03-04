package com.java8_4.predefined_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test3Function {

	public static void main(String[] args) {
		Function<Integer,Integer> f1 = i -> i * i;
		System.out.println(f1.apply(4)); // Output is: 16
		System.out.println(f1.apply(5)); // Output is: 25
		
		// Input Type is String and return Type is Integer
		Function<String,Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Raj")); // Output is: 3
		
		Function<String,String> f3 = s -> s.toUpperCase();
		System.out.println(f3.apply("Raj"));
		
		//Write a Function to Generate Grade.
		Function<Student, String> f4 = s -> {
			String grade = "";
			if(s.marks >= 80) grade = "A [Distinction]";
			else if(s.marks >= 60) grade = "B [First Class]";
			else if(s.marks >= 50) grade = "C [Second Class]";
			else if(s.marks >= 35) grade = "D [Third Class]";
			else grade = "E [Failed]";
			return grade;
		};
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("A Student", 100));
		studentList.add(new Student("B Student", 65));
		studentList.add(new Student("C Student", 55));
		studentList.add(new Student("D Student", 45));
		studentList.add(new Student("E Student", 25));
		for(Student st : studentList) {
			System.out.println("Name : "+st.name);
			System.out.println("Marks : "+st.marks);
			System.out.println("Grade : "+f4.apply(st));
			System.out.println();
		}
		
		Predicate<Student> p = s -> s.marks > 60;
		for(Student st : studentList) {
			if(p.test(st)) {
				System.out.println("Name : "+st.name);
				System.out.println("Marks : "+st.marks);
				System.out.println("Grade : "+f4.apply(st));
				System.out.println();
			}
		}
		
		// Function Chaining:
		Function<Integer, Integer> f5 = i -> i * 2;
		Function<Integer, Integer> f6 = i -> i * i * i;
		System.out.println(f1.andThen(f5).apply(2));	// Output 64
		System.out.println(f1.compose(f6).apply(2));	// Output 16
	}
}

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
