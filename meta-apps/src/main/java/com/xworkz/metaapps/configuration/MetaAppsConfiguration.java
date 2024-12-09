package com.xworkz.metaapps.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class MetaAppsConfiguration {
	
	public MetaAppsConfiguration() {
		System.out.println("Meta Configuration");
	}

}
