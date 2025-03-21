package com.xworkz.autospare.user.service;

import java.util.List;

import com.xworkz.autospare.seller.dto.ProductDto;
import com.xworkz.autospare.user.dto.UserSignupDto;
import com.xworkz.autospare.user.entity.UserSignupEntity;

public interface UserService {
	
	boolean onSave(UserSignupDto dto);
	
	UserSignupEntity getEmail(String email);

	boolean getAadhar(String aadhar);
	
	boolean getContact(String contact);
	
	boolean authenticate(String email, String password);
	
	UserSignupDto findByEmail(String email);
	
	boolean updateByEmail(UserSignupDto dto);
	
	boolean deleteByEmail(UserSignupDto dto);
	
	boolean sendOtp(String email);
	
	List<ProductDto> getAllProducts();

}
