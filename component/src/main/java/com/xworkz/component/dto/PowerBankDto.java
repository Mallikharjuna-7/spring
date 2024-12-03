package com.xworkz.component.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class PowerBankDto {

	@Value("Croma")
	private String brand;

	@Value("10000")
	private int capacity;

	@Value("25")
	private int maxOutput;

	@Value("2")
	private int noOfPorts;

	@Value("999")
	private int price;

	@Value("1")
	private int warrenty;

}
