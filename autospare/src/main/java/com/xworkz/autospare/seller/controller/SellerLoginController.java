package com.xworkz.autospare.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.seller.service.SellerService;

@RequestMapping("/")
@Component
public class SellerLoginController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping("/sellerLogin")
	public String loginSeller(@RequestParam("email") String email,@RequestParam int otp, Model model ) {
		
		SellerRegisterDto dto = service.loginSeller(email, otp);
		
		if(dto != null) {
			model.addAttribute("dto", dto);
			return "sellerHome";
		}
		return "sellerLogin";
	}
	
	@GetMapping("/addProduct")
	public String addProduct(@RequestParam String email,Model model) {
		
		SellerRegisterDto sellerDto = service.findByEmail(email);
		
		if(sellerDto != null) {
			model.addAttribute("sellerDto", sellerDto);
			return "addProduct";
		}
		return "sellerHome";
	}

}
