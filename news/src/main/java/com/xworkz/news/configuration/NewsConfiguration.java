package com.xworkz.news.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class NewsConfiguration {
	
	public NewsConfiguration() {
		System.out.println("news configuration");
	}

}
