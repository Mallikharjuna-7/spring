package com.xworkz.autospare.user.repository;

import java.util.List;

import com.xworkz.autospare.seller.entity.ProductEntity;
import com.xworkz.autospare.user.entity.UserSigninEntity;
import com.xworkz.autospare.user.entity.UserSignupEntity;

public interface UserRepository {
	
	boolean onSave(UserSignupEntity entity);
	
	UserSignupEntity getEmail(String email);
	
	UserSignupEntity getAadhar(String aadhar);
	
	UserSignupEntity getContact(String contact);
	
	UserSignupEntity authenticateUser(String email, String password);
	
	boolean signInSave(UserSigninEntity entity);
	
	boolean updateByEmail(UserSignupEntity entity);
	
	List<ProductEntity> getAllProducts();

}
