package com.xworkz.autospare.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.user.dto.UserSignupDto;
import com.xworkz.autospare.user.service.UserService;

@RequestMapping("/")
@Component
public class UserProfileUpdateController {
	
	@Autowired
	private UserService service;

	@GetMapping("updateUser")
	public String updateForm(@RequestParam String email, Model model) {
		UserSignupDto dto = service.findByEmail(email);
		model.addAttribute("updateResult", dto);
		return "userProfileUpdate";
	}

	@PostMapping("updateUser")
	public String getUpdate(@ModelAttribute UserSignupDto dto, Model model) {
		boolean updateResult = service.updateByEmail(dto);
		if (updateResult) {
			model.addAttribute("email", dto.getEmail());
			model.addAttribute("username", dto.getUsername());
			return "userHome";
		}
		return "userProfileUpdate";
	}

}
