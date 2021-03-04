package com.java8_4.predefined_functional_interface;

import java.util.Date;
import java.util.function.Supplier;

public class Test5Supplier {

	public static void main(String[] args) {
		Supplier<Date> s1 = () -> new Date();
		System.out.println(s1.get());	// Print Current System Date.
		
		// Supply Random OTP
		Supplier<String> s2 = () -> {
			String otp = "";
			for(int i = 0; i < 6 ; i++) {
				otp += (int)(Math.random() * 10);
			}
			// random() method generates 0 <= x < 1
			return otp;
		};
		System.out.println(s2.get());
	}
}
