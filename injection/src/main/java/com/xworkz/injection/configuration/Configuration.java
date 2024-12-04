package com.xworkz.injection.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class Configuration {

	public Configuration() {
		System.out.println("Configuration");
	}

}
