package com.xworkz.autospare.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.autospare.admin.service.AdminService;
import com.xworkz.autospare.seller.dto.SellerRegisterDto;

@RequestMapping("/")
@Component
public class SellersInfoController {
	
	@Autowired
	private AdminService service;
	
	@GetMapping("/allSellers")
	public String getAllRequests(Model model) {
		
		List<SellerRegisterDto> listOfAllSellers = service.getAllSellers();
		
		if(listOfAllSellers == null) {
			model.addAttribute("requests", "No Sellers found");
			return "sellersInfo";
		}
		model.addAttribute("listOfAllSellers", listOfAllSellers);
		return "sellersInfo";
	}
	
	@GetMapping("/approvedSellers")
	public String getApprovedRequests(Model model) {
		
		List<SellerRegisterDto> listOfApprovedSellers = service.getApprovedSellers();
		
		if(listOfApprovedSellers == null) {
			model.addAttribute("requets", "No Approved seller found");
			return "sellersInfo";
		}
		model.addAttribute("listOfApprovedSellers", listOfApprovedSellers);
		return "sellersInfo";
	}
	
	@GetMapping("/pendingSellers")
	public String getPendingRequests(Model model) {
		
		List<SellerRegisterDto> listOfPendingSellers = service.getPendingSellers();
		
		if(listOfPendingSellers == null) {
			model.addAttribute("requests", "No pending requests");
			return "sellersInfo";
		}
		model.addAttribute("listOfPendingSellers", listOfPendingSellers);
		return "sellersInfo";
	}
	

}
