package com.java8_4.predefined_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Test8BiConsumer {
	
	public static void main(String[] args) {
		
		BiFunction<String, Double, Employee2> f = (name, salary) -> new Employee2(name, salary);
		List<Employee2> l = new ArrayList<>();
		l.add(f.apply("A", 1000.0));
		l.add(f.apply("B", 2000.0));
		l.add(f.apply("C", 3000.0));
		l.add(f.apply("D", 4000.0));

		// Increment salary by 500
		BiConsumer<Employee2, Double> c = (e, s) -> e.salary = e.salary + s;
		for (Employee2 e : l) {
			c.accept(e, 500.0);
		}
		for (Employee2 e : l) {
			System.out.println(e.name + " : " + e.salary);
		}
	}
}

class Employee2 {
	String name;
	double salary;
	
	Employee2(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}
