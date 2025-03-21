package com.xworkz.autospare.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.autospare.user.dto.UserSignupDto;
import com.xworkz.autospare.user.service.UserService;

@RequestMapping("/")
@Controller
public class UserSignupController {
	
	@Autowired
	private UserService service;

	@GetMapping("/userSignup")
	public String getSignupResponse(@ModelAttribute UserSignupDto dto, Model model) {

		boolean save = service.onSave(dto);

		if (!save) {
			model.addAttribute("fail", "Check entered details");
			return "UserSignup";
		}
		return "userSignin";
	}

}
