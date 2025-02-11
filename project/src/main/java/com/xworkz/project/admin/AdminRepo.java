package com.xworkz.project.admin;

public interface AdminRepo {
	
	boolean adminSave(AdminEntity entity);
	
	AdminEntity authenticateAdmin(String adminEmail, String password);

}
