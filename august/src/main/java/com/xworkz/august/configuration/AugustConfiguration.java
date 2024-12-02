package com.xworkz.august.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AugustConfiguration {

	public AugustConfiguration() {

		System.out.println("August Constructor");
	}

}
