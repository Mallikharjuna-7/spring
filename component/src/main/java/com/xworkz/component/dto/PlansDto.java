package com.xworkz.component.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class PlansDto {

	@Value("Diwali Dhamaka")
	private String planName;

	@Value("premium")
	private String planType;

	@Value("799")
	private int price;

	@Value("90")
	private int validity;

	@Value("3")
	private int NoOfDevices;

	@Value("true")
	private boolean isAvailable;

}
