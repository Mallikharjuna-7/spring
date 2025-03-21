package com.xworkz.autospare.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.seller.service.SellerService;

@RequestMapping("/")
@Component
public class SellerRegisterController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping("/sellerRegistration")
	public String getRegisterResponse(@ModelAttribute SellerRegisterDto dto, Model model) {
		
		boolean register = service.onSave(dto);
		
		if(!register) {
			model.addAttribute("fail", "Enter valid details");
			return "sellerRegistration";
		}
		return "sellerLogin";
	}

}
