package com.xworkz.bike.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BikeConfiguration {

	public BikeConfiguration() {
		System.out.println("Bike Constructor");
	}

}
