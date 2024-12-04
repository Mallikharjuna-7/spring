package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class Oneplus implements Mobile {

	public Oneplus() {
		System.out.println("Oneplus");
	}
}
