package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class Hp implements Laptop {

	public Hp() {
		System.out.println("HP");
	}

}
