package com.xworkz.autospare.util;

import org.springframework.beans.BeanUtils;

import com.xworkz.autospare.seller.dto.ProductDto;
import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.seller.entity.ProductEntity;
import com.xworkz.autospare.seller.entity.SellerRegisterEntity;
import com.xworkz.autospare.user.dto.UserSignupDto;
import com.xworkz.autospare.user.entity.UserSignupEntity;

public class AutoSpareUtil {
	
	private AutoSpareUtil() {
		
	}
	
	//user
	public static UserSignupEntity convertDtoToEntity(UserSignupDto dto) {
		UserSignupEntity entity = new UserSignupEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public static UserSignupDto convertEntityToDto(UserSignupEntity entity) {
		UserSignupDto dto = new UserSignupDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
	
	//seller
	public static SellerRegisterEntity convertDtoToEntity(SellerRegisterDto dto) {
		SellerRegisterEntity entity = new SellerRegisterEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
	
	public static SellerRegisterDto convertEntityToDto(SellerRegisterEntity entity) {
		SellerRegisterDto dto = new SellerRegisterDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
	
	//product
	public static ProductEntity convertDtoToEntity(ProductDto dto) {
		ProductEntity entity = new ProductEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
	
	public static ProductDto convertEntityToDto(ProductEntity entity) {
		ProductDto dto = new ProductDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
