package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class MacOs implements Os {

	public MacOs() {
		System.out.println("MacOs");
	}
}
