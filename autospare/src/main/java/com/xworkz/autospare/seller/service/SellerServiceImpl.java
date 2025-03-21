package com.xworkz.autospare.seller.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.autospare.seller.dto.ProductDto;
import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.seller.entity.ProductEntity;
import com.xworkz.autospare.seller.entity.SellerRegisterEntity;
import com.xworkz.autospare.seller.repository.SellerRepository;
import com.xworkz.autospare.util.AutoSpareUtil;
import com.xworkz.autospare.util.mail.EmailSender;
import com.xworkz.autospare.util.mail.RandomOtpGenerator;

import lombok.Data;

@Data
@Component
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerRepository repo;

	@Autowired
	private EmailSender emailSender;

	@Override
	public boolean onSave(SellerRegisterDto dto) {

		SellerRegisterEntity entity = new SellerRegisterEntity();

		BeanUtils.copyProperties(dto, entity);

		entity.setCreatedBy(dto.getSellerName());
		entity.setCreatedOn(LocalDateTime.now());
		entity.setActiveStatus("active");
		entity.setRequestStatus("pending");
		repo.onSave(entity);
		emailSender.sendWelcomeMessage(entity.getSellerEmail(), entity.getSellerName());
		return true;
	}

	@Override
	public SellerRegisterDto findByEmail(String sellerEmail) {
		SellerRegisterEntity entity = repo.findByEmail(sellerEmail);

		if (entity != null) {
			return AutoSpareUtil.convertEntityToDto(entity);
		}
		return null;
	}

	@Override
	public boolean sendLoginOtp(String sellerEmail) {
		SellerRegisterEntity entity = repo.findByEmail(sellerEmail);
		int otp = RandomOtpGenerator.generateOTP();
		if (entity != null) {
			emailSender.sendLoginOTP(otp, entity.getSellerEmail(), entity.getSellerName());
			entity.setOtp(otp);
			repo.updateSeller(entity);
			return true;
		}
		return false;
	}

	@Override
	public SellerRegisterDto loginSeller(String email, int otp) {
		SellerRegisterEntity entity = repo.loginSeller(email, otp);
		
		if (entity != null) {
			return AutoSpareUtil.convertEntityToDto(entity);
		}
		return null;
	}
	
	private static final String IMAGE_DIRECTORY = "/home/durgaprasad/products/";
	
	@Override
	public boolean addProduct(ProductDto dto, MultipartFile imageFile, String email) throws IOException{
		
		SellerRegisterEntity sellerEntity = repo.findByEmail(email);
		
        // Save the image to the local directory
        if (!imageFile.isEmpty()) {
            String imageName = imageFile.getOriginalFilename();
            File destFile = new File(IMAGE_DIRECTORY + dto.getProductCode()+"@"+ imageName);
            imageFile.transferTo(destFile);
            dto.setProductImage(dto.getProductCode()+"@"+ imageName);
        }
        
        ProductEntity entity = new ProductEntity();
        
        entity.setSellerDetails(sellerEntity);
        
        BeanUtils.copyProperties(dto, entity);
        // Save the product to the database
        repo.saveProduct(entity);
        return true;
    }

	@Override
	public List<ProductDto> findBySellerId(int sellerId) {
		
		List<ProductEntity> entity = repo.findBySellerId(sellerId);

		return entity.stream().map(AutoSpareUtil::convertEntityToDto).collect(Collectors.toList());
	}

}
