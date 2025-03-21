package com.xworkz.autospare.seller.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.autospare.seller.dto.ProductDto;
import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.seller.service.SellerService;

@RequestMapping("/")
@Component
public class AddProductController {
	
	@Autowired
	private SellerService service;
	
	@PostMapping("/addProduct")
    public String addProduct(@RequestParam String email,
    						 @RequestParam("productName") String productName,
                             @RequestParam("productCode") String productCode,
                             @RequestParam("productDescription") String productDescription,
                             @RequestParam("price") double price,
                             @RequestParam("productCategory") String productCategory,
                             @RequestParam("stockQuantity") int stockQuantity,
                             @RequestParam("supplierName") String supplierName,
                             @RequestParam("productImage") MultipartFile productImage,Model model) throws IOException {

		
        ProductDto dto = new ProductDto();
        dto.setProductName(productName);
        dto.setProductCode(productCode);
        dto.setProductDescription(productDescription);
        dto.setPrice(price);
        dto.setProductCategory(productCategory);
        dto.setStockQuantity(stockQuantity);
        dto.setSupplierName(supplierName);

        // Call the service to handle the file upload and save product
        service.addProduct(dto, productImage,email);
        
        SellerRegisterDto sellerDto = service.findByEmail(email);
        
        model.addAttribute("dto", sellerDto);
        return "sellerHome"; // Redirect to the form or a success page
    }

}
