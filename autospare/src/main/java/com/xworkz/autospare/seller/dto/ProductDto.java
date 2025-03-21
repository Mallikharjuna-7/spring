package com.xworkz.autospare.seller.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ProductDto {
	
	private Long id;

    private String productName;
    
    private String productCode;

    private String productDescription;

    private double price;
    
    private String productCategory;
    
    private int stockQuantity;
    
    private String supplierName;
    
    private String productImage;

}
