package com.xworkz.tshirt.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class TshirtConfiguration {

	public TshirtConfiguration() {
		System.out.println("Tshirt Configuration");
	}

}
