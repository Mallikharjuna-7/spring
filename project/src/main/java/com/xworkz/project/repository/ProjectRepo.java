package com.xworkz.project.repository;

import com.xworkz.project.entity.SignUpEntity;

import java.util.List;

import com.xworkz.project.entity.SignInEntity;

public interface ProjectRepo {

	boolean onSave(SignUpEntity entity);
	
	SignUpEntity authenticateUser(String email, String password);
	
	boolean signInSave(SignInEntity entity);
	
	SignUpEntity getEmail(String email);
	
	SignUpEntity getAadhar(String aadhar);
	
	SignUpEntity getContact(String contact);
	
	boolean updateByEmail(SignUpEntity entity) ;
	
	List<SignUpEntity> getActiveUsers();
	
	List<SignUpEntity> getInactiveUsers();
	
	List<SignUpEntity> getAllUsers();

}
