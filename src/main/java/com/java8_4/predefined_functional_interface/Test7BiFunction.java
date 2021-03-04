package com.java8_4.predefined_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Test7BiFunction {

	public static void main(String[] args) {
		BiFunction<Integer, String, Employee1> f = (eno, name) -> new Employee1(eno, name); 
		
		List<Employee1> l = new ArrayList<>();
		l.add(f.apply(100, "A"));
		l.add(f.apply(200, "B"));
		l.add(f.apply(300, "C"));
		l.add(f.apply(400, "D"));
		
		for(Employee1 e : l) {
			System.out.println(e.eno + " : " + e.name);
		}
	}
}

class Employee1 {
	int eno;
	String name;
	Employee1(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}
}