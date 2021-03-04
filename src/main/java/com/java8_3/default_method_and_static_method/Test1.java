package com.java8_3.default_method_and_static_method;

public class Test1 implements MyInterface {
	
	public void m3() {
		System.out.println("Overriding version of Default Method");
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m3();
	}

}
