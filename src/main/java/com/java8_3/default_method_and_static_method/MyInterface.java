package com.java8_3.default_method_and_static_method;

public interface MyInterface {
	
	default void m3() {
		System.out.println("Default Method");
	}
	
	public static void m1() {
		System.out.println("Interface Static method");
	}
	
}
