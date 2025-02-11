package com.xworkz.project.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.entity.SignInEntity;
import com.xworkz.project.repository.ProjectRepo;
import com.xworkz.project.util.ProjectUtil;

import lombok.Data;

@Data
@Component
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepo repo;

	@Override
	public boolean onSave(ProjectDto dto) {

		SignUpEntity entity = new SignUpEntity();

		BeanUtils.copyProperties(dto, entity);

		entity.setCreatedBy(dto.getUsername());
		entity.setCreatedOn(LocalDateTime.now());
		entity.setUserStatus("active");
		repo.onSave(entity);
		return true;
	}

	@Override
	public boolean authenticate(String email, String password) {

		SignInEntity signInEntity = new SignInEntity();

		SignUpEntity entity = repo.authenticateUser(email, password);
		
		SignUpEntity data = repo.getEmail(email);

		if (entity != null && entity.getUserStatus().equalsIgnoreCase("active") && entity.getSigninFailCount() < 3) {
			signInEntity.setUserId(entity.getId());
			signInEntity.setSignInTime(LocalDateTime.now());
			repo.signInSave(signInEntity);
			data.setSigninFailCount(0);
			repo.updateByEmail(data); // making fail count 0 after successful signing
			return true;
		} else {
			if(data != null && data.getUserStatus().equalsIgnoreCase("active") && data.getSigninFailCount() < 3) {
				int newFailCount = data.getSigninFailCount() + 1;
				data.setSigninFailCount(newFailCount);
				repo.updateByEmail(data);
				return false;
			}
			return false;
		}
	}

	@Override
	public SignUpEntity getEmail(String email) {

		if (email != null) {
			return repo.getEmail(email);
		}
		return null;
	}

	@Override
	public boolean getAadhar(String aadhar) {

		if (aadhar != null) {
			SignUpEntity aadharNo = repo.getAadhar(aadhar);
			if (aadharNo != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getContact(String contact) {
		if (contact != null) {
			SignUpEntity contactNo = repo.getContact(contact);
			if (contactNo != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ProjectDto findByEmail(String email) {
		if (email != null) {
			SignUpEntity entity = repo.getEmail(email);
			return ProjectUtil.convertEntityToDto(entity);
		}
		return null;
	}

	@Override
	public boolean updateByEmail(ProjectDto dto) {

		SignUpEntity entity = new SignUpEntity();

		BeanUtils.copyProperties(dto, entity);

		entity.setUpdatedBy(dto.getUsername());
		entity.setUpdatedOn(LocalDateTime.now());
		entity.setUserStatus("active");
		repo.updateByEmail(entity);
		return true;

	}

	@Override
	public boolean deleteByEmail(ProjectDto dto) {

		SignUpEntity entity = new SignUpEntity();

		BeanUtils.copyProperties(dto, entity);

		entity.setUpdatedBy(dto.getUsername());
		entity.setUpdatedOn(LocalDateTime.now());
		entity.setUserStatus("inactive");

		repo.updateByEmail(entity);
		return true;
	}

	@Override
	public List<ProjectDto> getActiveUsers() {

		List<SignUpEntity> entity = repo.getActiveUsers();

		return entity.stream().map(ProjectUtil::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public List<ProjectDto> getInactiveUsers() {

		List<SignUpEntity> entity = repo.getInactiveUsers();

		return entity.stream().map(ProjectUtil::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public List<ProjectDto> getAllUsers() {

		List<SignUpEntity> entity = repo.getAllUsers();

		return entity.stream().map(ProjectUtil::convertEntityToDto).collect(Collectors.toList());
	}

}
