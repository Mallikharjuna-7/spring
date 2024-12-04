package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class Linux implements Os {

	public Linux() {
		System.out.println("Linux");
	}
}
