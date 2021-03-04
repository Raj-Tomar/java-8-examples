package com.java8_3.default_method_and_static_method;

public class Test2 implements MyInterface1, MyInterface2{
	
	@Override	
	public void m1() {
		System.out.println("Overriden Method");
		// To call MyInterface1/MyInterface2 m1() method
		// MyInterface1.super.m1();
		MyInterface2.super.m1();
	}
	
	public static void main(String[] args) {
		new Test2().m1();
	}
}
