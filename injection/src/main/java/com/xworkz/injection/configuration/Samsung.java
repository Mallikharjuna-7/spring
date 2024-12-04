package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile {

	public Samsung() {
		System.out.println("Samsung");
	}
}
