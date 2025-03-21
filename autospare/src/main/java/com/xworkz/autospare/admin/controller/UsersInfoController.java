package com.xworkz.autospare.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.autospare.admin.service.AdminService;
import com.xworkz.autospare.user.dto.UserSignupDto;

@RequestMapping("/")
@Component
public class UsersInfoController {
	
	@Autowired
	private AdminService service;
	
	@GetMapping("/allUsers")
	public String readAllUsers(Model model) {

		List<UserSignupDto> listOfAllUsers = service.getAllUsers();

		if (listOfAllUsers == null) {
			model.addAttribute("fail", "Users Not Found");
			return "usersInfo";
		}
		model.addAttribute("listOfAllUsers", listOfAllUsers);
		return "usersInfo";
	}
	
	@GetMapping("/activeUsers")
	public String readActiveUsers(Model model) {

		List<UserSignupDto> listOfActiveUsers = service.getActiveUsers();

		if (listOfActiveUsers == null) {
			model.addAttribute("fail", "Active Users Not Found");
			return "usersInfo";
		}
		model.addAttribute("listOfActiveUsers", listOfActiveUsers);
		return "usersInfo";
	}

	@GetMapping("/inactiveUsers")
	public String readInactiveUsers(Model model) {

		List<UserSignupDto> listOfInactiveUsers = service.getInactiveUsers();

		if (listOfInactiveUsers == null) {
			model.addAttribute("fail", "Inactive Users Not Found");
			return "usersInfo";
		}
		model.addAttribute("listOfInactiveUsers", listOfInactiveUsers);
		return "usersInfo";
	}

}
