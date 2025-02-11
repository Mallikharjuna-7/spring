package com.xworkz.project.service;

import java.util.List;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.SignUpEntity;

public interface ProjectService {

	boolean onSave(ProjectDto dto);

	boolean authenticate(String email, String password);

	SignUpEntity getEmail(String email);

	boolean getAadhar(String aadhar);
	
	boolean getContact(String contact);
	
	ProjectDto findByEmail(String email);
	
	boolean updateByEmail(ProjectDto dto);
	
	boolean deleteByEmail(ProjectDto dto);
	
	List<ProjectDto> getActiveUsers();
	
	List<ProjectDto> getInactiveUsers();
	
	List<ProjectDto> getAllUsers();

}
