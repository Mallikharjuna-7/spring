package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class Poco implements Mobile {

	public Poco() {
		System.out.println("Poco");
	}

}
