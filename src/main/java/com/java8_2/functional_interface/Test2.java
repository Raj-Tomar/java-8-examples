package com.java8_2.functional_interface;

public class Test2 {

	public static void main(String[] args) {
		MyRunnable m = new MyRunnable();
		Thread t = new Thread(m);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		// There are 2 Threads - main thread and child thread.
		// Both thread will execute simultaneously.
		// We will be getting mixed output.

		// Runnable interface is Functional Interface.
		// We can remove MyRunnable class and go for Lambda Expression.
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread 1");
			}
		};
		Thread t2 = new Thread(r);
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread 1");
		}
	}
}

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}