package com.xworkz.autospare.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.admin.service.AdminService;
import com.xworkz.autospare.seller.dto.SellerRegisterDto;

@RequestMapping("/")
@Component
public class SellerRequestController {
	
	@Autowired
	private AdminService service;
	
	@GetMapping("/approve")
	public String approveSeller(@RequestParam int id, Model model) {
		
		SellerRegisterDto dto = service.findById(id);
		
		if(dto != null) {
			service.approveSellerRequest(dto);
		}
		return "sellersInfo";
		
	}
	
	@GetMapping("/reject")
	public String rejectSeller(@RequestParam int id, Model model) {
		
		SellerRegisterDto dto = service.findById(id);
		
		if(dto != null) {
			service.rejectSellerRequest(dto);
		}
		return "sellersInfo";
		
	}

}
