package com.xworkz.autospare.admin.dto;

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
