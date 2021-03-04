package com.java8_2.functional_interface;

@FunctionalInterface
public interface A {

	public void m1();
	
	default void m2() {
		System.out.println("Interface Default Method");
	}
	public static void m3() {
		System.out.println("Interface Static Method");
	}
	
}
