package com.rgb.color.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rgb")
public class ColorConfiguration {

	public ColorConfiguration() {
		System.out.println("color configuration");
	}

}
