package com.xworkz.project.admin;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AdminDto {
	
	private int id;
	
	private int adminId;
	
	private String adminName;
	
	private String adminEmail;
	
	private String password;

}
