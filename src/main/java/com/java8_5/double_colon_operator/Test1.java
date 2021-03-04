package com.java8_5.double_colon_operator;

public class Test1 {

	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};
		// We can Replace this Lamda Expression as below:
		Runnable r1 = Test1::m1;
		// :: Method Reference
		// Runnable Interface run method is referring to m1() method.

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
