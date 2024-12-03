package com.xworkz.component.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class ChairsDto {

	@Value("The sleep")
	private String chairName;

	@Value("Plastic & Metal")
	private String material;

	@Value("90")
	private int height;

	@Value("110")
	private int capacity;

	@Value("Brown")
	private String color;

	@Value("3900")
	private int price;

}
