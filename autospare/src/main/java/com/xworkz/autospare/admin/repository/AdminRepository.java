package com.xworkz.autospare.admin.repository;

import java.util.List;

import com.xworkz.autospare.admin.entity.AdminEntity;
import com.xworkz.autospare.seller.entity.SellerRegisterEntity;
import com.xworkz.autospare.user.entity.UserSignupEntity;

public interface AdminRepository {
	
	AdminEntity authenticateAdmin(String adminEmail, String password);
	
	List<UserSignupEntity> getAllUsers();
	
	List<UserSignupEntity> getActiveUsers();
	
	List<UserSignupEntity> getInactiveUsers();
	
	List<SellerRegisterEntity> getAllSellers();
	
	List<SellerRegisterEntity> getApprovedSellers();
	
	List<SellerRegisterEntity> getPendingSellers();
	
	SellerRegisterEntity findById(int id);
	
	boolean updateSeller(SellerRegisterEntity entity);
}
