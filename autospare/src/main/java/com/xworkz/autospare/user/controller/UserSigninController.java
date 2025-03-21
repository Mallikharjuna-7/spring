package com.xworkz.autospare.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.seller.dto.ProductDto;
import com.xworkz.autospare.user.entity.UserSignupEntity;
import com.xworkz.autospare.user.service.UserService;

@RequestMapping("/")
@Component
public class UserSigninController {
	
	@Autowired
	private UserService service;

	@GetMapping("/userSignin")
	public String getSignIn(@RequestParam String email,@RequestParam String password, Model model) {

		boolean result = service.authenticate(email, password);
		
		UserSignupEntity entity = service.getEmail(email);
		
		List<ProductDto> listOfProducts = service.getAllProducts();
		
		if (!result) {
			if(entity != null) {
				if(entity.getSigninFailCount() == 1) {
					model.addAttribute("attempt", "your account will blocked after 2 more unsuccessful attempts.");
				}else if(entity.getSigninFailCount() == 2) {
					model.addAttribute("attempt", "your account will blocked after 1 more unsuccessful attempts.");
				}else if(entity.getSigninFailCount() == 3) {
					model.addAttribute("attempt", "your account is blocked. pls reset password to continue.");
				}
				
			}		
			model.addAttribute("fail", "incorrect email or password");
			return "userSignin";
		}
		//email, display
		model.addAttribute("email", email);
		model.addAttribute("username", entity.getUsername());
		if(listOfProducts != null) {
			model.addAttribute("listOfProducts", listOfProducts);
		}
		return "userHome";
	}
	
	@GetMapping("/signin")
	public String userSignin() {
		return "userSignin";
	}

}
