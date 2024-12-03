package com.xworkz.component.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class CupDto {

	@Value("Tea Cup")
	private String cupName;

	@Value("Glass")
	private String material;

	@Value("Transparent")
	private String color;

	@Value("80")
	private int capacity;

	@Value("49")
	private int price;

	@Value("true")
	private boolean isAvailable;

}
