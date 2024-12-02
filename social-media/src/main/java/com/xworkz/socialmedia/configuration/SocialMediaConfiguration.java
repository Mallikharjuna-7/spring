package com.xworkz.socialmedia.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SocialMediaConfiguration {

	public SocialMediaConfiguration() {
		System.out.println("Social Media Constructor");
	}

}
