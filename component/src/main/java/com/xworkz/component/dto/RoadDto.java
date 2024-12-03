package com.xworkz.component.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class RoadDto {

	@Value("Chennai-Bangaluru")
	private String roadName;

	@Value("National Highway")
	private String roadType;

	@Value("4")
	private int lanes;

	@Value("120")
	private int speedLimit;

	@Value("Open")
	private String roadStatus;

	@Value("340")
	private int roadLength;

}
