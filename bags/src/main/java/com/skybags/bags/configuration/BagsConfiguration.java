package com.skybags.bags.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.skybags")
public class BagsConfiguration {

	public BagsConfiguration() {
		System.out.println("Bags Configuration");
	}
}
