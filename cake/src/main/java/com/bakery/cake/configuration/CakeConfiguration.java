package com.bakery.cake.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bakery")
public class CakeConfiguration {

	public CakeConfiguration() {
		System.out.println("Cake configuration");
	}

}
