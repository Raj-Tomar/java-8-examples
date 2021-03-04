package com.java8_4.predefined_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2Function {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("A", 1000));
		empList.add(new Employee("B", 2000));
		empList.add(new Employee("C", 3000));
		empList.add(new Employee("D", 4000));
		empList.add(new Employee("E", 5000));
		empList.add(new Employee("F", 6000));
		
		// Check employee salary > 3000
		Predicate<Employee> p = e -> e.salary > 3000;
		for(Employee emp : empList) {
			if(p.test(emp)) {
				System.out.println(emp.name + " : " + emp.salary);
			}
		}
		
		// Predicate Joining
		int[] x = {0, 5, 10, 15, 20, 25, 30, 35};
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		// and(), or(), negate()
		for(int x1 : x) {
			if(p1.and(p2).test(x1)) {
				System.out.println("Even and > 10 : " + x1);	// 20, 30
			}
			
			if(p1.or(p2).test(x1)) {
				System.out.println("Even or > 10 : " + x1);	// 0, 10, 15, 20, 25, 30, 35
			}
			
			if(p1.negate().test(x1)) {
				System.out.println("Not Even : " + x1);	//  5, 15, 25, 35
			}
		}
	}
}

class Employee {

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}