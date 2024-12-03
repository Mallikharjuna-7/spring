package com.xworkz.component.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.xworkz")
@Component
public class BuildingDto {

	@Value("123")
	private int buildingNo;

	@Value("PG")
	private String buildingName;

	@Value("BTM")
	private String buildingLocation;

	@Value("5")
	private int noOfFloors;

	@Value("50")
	private int noOfRooms;

	@Value("true")
	private boolean isLiftAvailable;

}
