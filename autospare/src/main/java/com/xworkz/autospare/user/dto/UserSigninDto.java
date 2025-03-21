package com.xworkz.autospare.user.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UserSigninDto {
	
	private int id;

	private int userId;

	private LocalDateTime signInTime;

}
