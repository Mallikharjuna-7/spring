package com.xworkz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.service.ProjectService;

@RequestMapping("/")
@Component
public class SignInController {

	@Autowired
	private ProjectService service;

	@GetMapping("/signin")
	public String getSignIn(@RequestParam String email,@RequestParam String password,Model model) {

		boolean result = service.authenticate(email, password);
		
		SignUpEntity entity = service.getEmail(email);
		
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
			return "signin";
		}
		//email, display
		model.addAttribute("email", email);
		model.addAttribute("username", entity.getUsername());
		return "userHome";
	}

}
