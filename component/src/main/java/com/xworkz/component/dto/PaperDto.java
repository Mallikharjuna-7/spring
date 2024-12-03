package com.xworkz.component.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class PaperDto {

	@Value("Classmate")
	private String paperBrand;

	@Value("Glossy")
	private String paperType;

	@Value("A4")
	private String size;

	@Value("0.10")
	private double thickness;

	@Value("White")
	private String color;

	@Value("3")
	private int price;

}
