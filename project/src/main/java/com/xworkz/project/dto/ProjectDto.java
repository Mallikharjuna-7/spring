package com.xworkz.project.dto;


import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ProjectDto {
	
	private int id;
	
	private String username;
	
	private String email;
	
	private String contact;
	
	private String password;
	
	private String aadhar;
	
	private String dob;
	
	private String alternativeContact;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private int pincode;
	
	private String address;
	
	private String createdBy;

	private LocalDateTime createdOn;
	
	private String updatedBy;
	
	private LocalDateTime updatedOn;
	
	private String userStatus;
	
	private int signinFailCount;

}
