package com.xworkz.component.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class ComputerDto {

	@Value("HP")
	private String brand;

	@Value("lattitude 5501")
	private String model;

	@Value("16")
	private int ram;

	@Value("512")
	private int storage;

	@Value("14.0")
	private double displaySize;

	@Value("49000")
	private int price;
}
