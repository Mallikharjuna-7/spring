package com.xworkz.autospare.user.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.autospare.seller.dto.ProductDto;
import com.xworkz.autospare.seller.entity.ProductEntity;
import com.xworkz.autospare.user.dto.UserSignupDto;
import com.xworkz.autospare.user.entity.UserSigninEntity;
import com.xworkz.autospare.user.entity.UserSignupEntity;
import com.xworkz.autospare.user.repository.UserRepository;
import com.xworkz.autospare.util.AutoSpareUtil;
import com.xworkz.autospare.util.mail.EmailSender;
import com.xworkz.autospare.util.mail.RandomOtpGenerator;

import lombok.Data;

@Component
@Data
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Autowired
	private EmailSender emailSender;

	@Override
	public boolean onSave(UserSignupDto dto) {

		UserSignupEntity entity = new UserSignupEntity();

		BeanUtils.copyProperties(dto, entity);

		entity.setCreatedBy(dto.getUsername());
		entity.setCreatedOn(LocalDateTime.now());
		entity.setUserStatus("active");
		repo.onSave(entity);
		return true;
	}

	@Override
	public UserSignupEntity getEmail(String email) {

		if (email != null) {
			return repo.getEmail(email);
		}
		return null;
	}

	@Override
	public boolean getAadhar(String aadhar) {

		if (aadhar != null) {
			UserSignupEntity aadharNo = repo.getAadhar(aadhar);
			if (aadharNo != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getContact(String contact) {
		if (contact != null) {
			UserSignupEntity contactNo = repo.getContact(contact);
			if (contactNo != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean authenticate(String email, String password) {

		UserSigninEntity signInEntity = new UserSigninEntity();

		UserSignupEntity entity = repo.authenticateUser(email, password);

		UserSignupEntity data = repo.getEmail(email);

		if (entity != null && entity.getUserStatus().equalsIgnoreCase("active") && entity.getSigninFailCount() < 3) {
			signInEntity.setUserId(entity.getId());
			signInEntity.setSignInTime(LocalDateTime.now());
			repo.signInSave(signInEntity);
			data.setSigninFailCount(0);
			repo.updateByEmail(data); // making fail count 0 after successful signing
			return true;
		} else {
			if (data != null && data.getUserStatus().equalsIgnoreCase("active") && data.getSigninFailCount() < 3) {
				int newFailCount = data.getSigninFailCount() + 1;
				data.setSigninFailCount(newFailCount);
				repo.updateByEmail(data);
				return false;
			}
			return false;
		}
	}

	@Override
	public UserSignupDto findByEmail(String email) {
		if (email != null) {
			UserSignupEntity entity = repo.getEmail(email);
			return AutoSpareUtil.convertEntityToDto(entity);
		}
		return null;
	}

	@Override
	public boolean updateByEmail(UserSignupDto dto) {

		UserSignupEntity entity = new UserSignupEntity();

		BeanUtils.copyProperties(dto, entity);

		entity.setUpdatedBy(dto.getUsername());
		entity.setUpdatedOn(LocalDateTime.now());
		entity.setUserStatus("active");
		repo.updateByEmail(entity);
		return true;

	}

	@Override
	public boolean deleteByEmail(UserSignupDto dto) {

		UserSignupEntity entity = new UserSignupEntity();

		BeanUtils.copyProperties(dto, entity);

		entity.setUpdatedBy(dto.getUsername());
		entity.setUpdatedOn(LocalDateTime.now());
		entity.setUserStatus("inactive");

		repo.updateByEmail(entity);
		return true;
	}

	@Override
	public boolean sendOtp(String email) {
		UserSignupEntity entity = repo.getEmail(email);
		int otp = RandomOtpGenerator.generateOTP();
		if (entity != null) {
			emailSender.sendOtp(otp, entity.getEmail(), entity.getUsername());
			entity.setOtp(otp);
			entity.setOtpGeneratedTime(LocalDateTime.now());
			repo.updateByEmail(entity);
			return true;
		}
		return false;
	}

	@Override
	public List<ProductDto> getAllProducts() {
		
		List<ProductEntity> entity = repo.getAllProducts();

		return entity.stream().map(AutoSpareUtil::convertEntityToDto).collect(Collectors.toList());
	}
}
