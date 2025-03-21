package com.xworkz.autospare.seller.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SellerRegisterDto {
	
	private int id;
	
	private String sellerName;
	
	private String sellerEmail;
	
	private String sellerContact;
	
	private String industryName;
	
	private String gstNumber;
	
	private String typeOfIndustry;
	
	private String isOnlineServiceAvailable;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private String address;
	
	private String pincode;
	
	private String createdBy;
	
	private LocalDateTime createdOn;
	
	private String updatedBy;
	
	private LocalDateTime updatedOn;
	
	private String activeStatus;
	
	private String requestStatus;
	
	private int otp;

}
