package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class Acer implements Laptop {

	public Acer() {
		System.out.println("Acer");
	}
}
