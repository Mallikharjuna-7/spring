package com.xworkz.autospare.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.user.dto.UserSignupDto;
import com.xworkz.autospare.user.service.UserService;

@RequestMapping("/")
@Component
public class UserDeleteController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam String email, Model model) {
		
		UserSignupDto dto = service.findByEmail(email);
		boolean delete = service.deleteByEmail(dto);		
		if(delete) {
			return "userSignin";
		}
		return "userHome";
	}

}
