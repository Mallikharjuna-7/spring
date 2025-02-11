package com.xworkz.project.admin;

public interface AdminService {
	
	boolean adminSave(AdminDto dto);
	
	boolean authenticateAdmin(String adminEmail, String password);

}
