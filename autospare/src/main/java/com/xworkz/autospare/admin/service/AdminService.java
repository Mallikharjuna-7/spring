package com.xworkz.autospare.admin.service;

import java.util.List;

import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.user.dto.UserSignupDto;

public interface AdminService {
	
	boolean authenticateAdmin(String adminEmail, String password);
	
	List<UserSignupDto> getAllUsers();
	
	List<UserSignupDto> getActiveUsers();
	
	List<UserSignupDto> getInactiveUsers();
	
	List<SellerRegisterDto> getAllSellers();
	
	List<SellerRegisterDto> getApprovedSellers();
	
	List<SellerRegisterDto> getPendingSellers();
	
	SellerRegisterDto findById(int id);
	
	boolean approveSellerRequest(SellerRegisterDto dto);
	
	boolean rejectSellerRequest(SellerRegisterDto dto);
}
