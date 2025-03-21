package com.xworkz.autospare.seller.repository;

import java.util.List;

import com.xworkz.autospare.seller.entity.ProductEntity;
import com.xworkz.autospare.seller.entity.SellerRegisterEntity;

public interface SellerRepository {
	
	boolean onSave(SellerRegisterEntity entity);
	
	SellerRegisterEntity findByEmail(String sellerEmail);
	
	boolean updateSeller(SellerRegisterEntity entity);
	
	SellerRegisterEntity loginSeller(String email, int otp);
	
	boolean saveProduct(ProductEntity entity);
	
	List<ProductEntity> findBySellerId(int sellerId);

}
