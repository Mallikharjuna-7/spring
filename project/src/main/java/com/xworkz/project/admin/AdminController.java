package com.xworkz.project.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Component
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	public void adminSave(@ModelAttribute AdminDto dto) {
		service.adminSave(dto);
	}

	@GetMapping("/adminsignin")
	public String adminSignIn(@RequestParam("adminEmail")String adminEmail,@RequestParam("password")String password,Model model) {
		
		model.addAttribute("adminEmail", adminEmail);
		model.addAttribute("password", password);
		boolean result = service.authenticateAdmin(adminEmail, password);
		if(!result) {
			model.addAttribute("fail", "incorrect email or password");
			return "adminSignin";
		}
		model.addAttribute("adminEmail", adminEmail);
		return "adminHome";
	}
}
