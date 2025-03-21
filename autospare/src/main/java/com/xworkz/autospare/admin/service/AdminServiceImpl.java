package com.xworkz.autospare.admin.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.autospare.admin.entity.AdminEntity;
import com.xworkz.autospare.admin.repository.AdminRepository;
import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.seller.entity.SellerRegisterEntity;
import com.xworkz.autospare.user.dto.UserSignupDto;
import com.xworkz.autospare.user.entity.UserSignupEntity;
import com.xworkz.autospare.util.AutoSpareUtil;
import com.xworkz.autospare.util.mail.EmailSender;

import lombok.Data;

@Data
@Component
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository repo;
	
	@Autowired
	private EmailSender emailSender;

	@Override
	public boolean authenticateAdmin(String adminEmail, String password) {

		AdminEntity entity = repo.authenticateAdmin(adminEmail, password);

		if (entity != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<UserSignupDto> getAllUsers() {

		List<UserSignupEntity> entity = repo.getAllUsers();

		return entity.stream().map(AutoSpareUtil::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public List<UserSignupDto> getActiveUsers() {

		List<UserSignupEntity> entity = repo.getActiveUsers();

		return entity.stream().map(AutoSpareUtil::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public List<UserSignupDto> getInactiveUsers() {

		List<UserSignupEntity> entity = repo.getInactiveUsers();

		return entity.stream().map(AutoSpareUtil::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public List<SellerRegisterDto> getAllSellers() {

		List<SellerRegisterEntity> entity = repo.getAllSellers();

		return entity.stream().map(AutoSpareUtil::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public List<SellerRegisterDto> getApprovedSellers() {

		List<SellerRegisterEntity> entity = repo.getApprovedSellers();

		return entity.stream().map(AutoSpareUtil::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public List<SellerRegisterDto> getPendingSellers() {

		List<SellerRegisterEntity> entity = repo.getPendingSellers();

		return entity.stream().map(AutoSpareUtil::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public SellerRegisterDto findById(int id) {

		SellerRegisterEntity entity = repo.findById(id);

		if (entity != null) {
			return AutoSpareUtil.convertEntityToDto(entity);
		}
		return null;
	}

	@Override
	public boolean approveSellerRequest(SellerRegisterDto dto) {

		SellerRegisterEntity entity = new SellerRegisterEntity();

		AdminEntity adminEntity = new AdminEntity();

		BeanUtils.copyProperties(dto, entity);
		entity.setUpdatedBy(adminEntity.getAdminName());
		entity.setUpdatedOn(LocalDateTime.now());
		entity.setRequestStatus("approved");
		repo.updateSeller(entity);
		emailSender.sendApprovedMessage(entity.getSellerEmail(), entity.getSellerName());
		return true;
	}

	@Override
	public boolean rejectSellerRequest(SellerRegisterDto dto) {

		SellerRegisterEntity entity = new SellerRegisterEntity();

		AdminEntity adminEntity = new AdminEntity();

		BeanUtils.copyProperties(dto, entity);
		entity.setUpdatedBy(adminEntity.getAdminName());
		entity.setUpdatedOn(LocalDateTime.now());
		entity.setRequestStatus("rejected");
		repo.updateSeller(entity);
		emailSender.sendRejectedMessage(entity.getSellerEmail(), entity.getSellerName());
		return true;
	}

}
