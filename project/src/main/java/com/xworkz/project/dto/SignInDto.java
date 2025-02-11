package com.xworkz.project.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SignInDto {
	
	private int id;

	private int userId;

	private LocalDateTime signInTime;

}
