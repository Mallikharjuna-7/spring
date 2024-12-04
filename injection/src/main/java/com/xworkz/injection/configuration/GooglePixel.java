package com.xworkz.injection.configuration;

import org.springframework.stereotype.Component;

@Component
public class GooglePixel implements Mobile {

	public GooglePixel() {
		System.out.println("GooglePixel");
	}

}
