package com.xworkz.googleapps.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class GoogleAppsConfiguration {

	public GoogleAppsConfiguration() {
		System.out.println("Google apps configuration");
	}
}
