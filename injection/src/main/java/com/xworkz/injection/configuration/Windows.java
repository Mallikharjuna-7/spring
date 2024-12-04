package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class Windows implements Os {

	public Windows() {
		System.out.println("Windows");
	}

}
