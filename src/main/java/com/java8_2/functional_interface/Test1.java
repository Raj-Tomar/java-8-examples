package com.java8_2.functional_interface;

public class Test1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();

		MyInterface m = new Demo();
		m.m1();

		// We can implement MyInterface with Lambda expression also.
		// We are not required to write Demo class.
		// We can remove Demo class
		MyInterface m1 = () -> System.out.println("Hello by Lambda Expression");
		m1.m1();
	}
}

class Demo implements MyInterface {
	public void m1() {
		System.out.println("Hello m1()");
	}
}