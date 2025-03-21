package com.xworkz.autospare.seller.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.xworkz.autospare.seller.dto.ProductDto;
import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.seller.entity.SellerRegisterEntity;

public interface SellerService {
	
	boolean onSave(SellerRegisterDto dto);
	
	SellerRegisterDto findByEmail(String sellerEmail);
	
	boolean sendLoginOtp(String sellerEmail);
	
	SellerRegisterDto loginSeller(String email, int otp);
	
	boolean addProduct(ProductDto dto,MultipartFile imageFile, String email) throws IOException;
	
	List<ProductDto> findBySellerId(int sellerId);
	

}
