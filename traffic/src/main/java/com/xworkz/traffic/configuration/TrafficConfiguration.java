package com.xworkz.traffic.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TrafficConfiguration {

	public TrafficConfiguration() {
		System.out.println("Traffic Configuration Constructor");
	}

}
