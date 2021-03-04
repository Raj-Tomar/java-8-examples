package com.java8_2.functional_interface;

public class Test4 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			// Write Implementation for Runnable
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
			}
			// Instead of implementing separate class, we can implement where ever
			// functionality is required.
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

		A a = new A() {
			public void m1() {
				System.out.println("m1");
			}

			public void m2() {
				System.out.println("m2");
			}
		};
	}
}

interface C {
	public void m1();

	public void m2();
}