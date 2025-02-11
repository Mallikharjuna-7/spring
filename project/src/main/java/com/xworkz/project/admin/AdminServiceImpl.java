package com.xworkz.project.admin;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo repo;

	@Override
	public boolean adminSave(AdminDto dto) {

		AdminEntity entity = new AdminEntity();
		BeanUtils.copyProperties(dto, entity);
		repo.adminSave(entity);
		return true;
	}

	@Override
	public boolean authenticateAdmin(String adminEmail, String password) {

		AdminEntity entity = repo.authenticateAdmin(adminEmail, password);

		if (entity != null) {
			return true;
		} else {
			return false;
		}
	}

}
