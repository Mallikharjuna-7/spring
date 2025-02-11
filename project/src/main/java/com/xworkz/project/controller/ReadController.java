package com.xworkz.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.service.ProjectService;

@RequestMapping("/")
@Component
public class ReadController {

	@Autowired
	private ProjectService service;

	@GetMapping("/activeUsers")
	public String readActiveUsers(Model model) {

		List<ProjectDto> listOfActiveUsers = service.getActiveUsers();

		if (listOfActiveUsers == null) {
			model.addAttribute("fail", "Active Users Not Found");
			return "usersInfo";
		}
		model.addAttribute("listOfActiveUsers", listOfActiveUsers);
		return "usersInfo";

	}

	@GetMapping("/inactiveUsers")
	public String readInactiveUsers(Model model) {

		List<ProjectDto> listOfInactiveUsers = service.getInactiveUsers();

		if (listOfInactiveUsers == null) {
			model.addAttribute("fail", "Inactive Users Not Found");
			return "usersInfo";
		}
		model.addAttribute("listOfInactiveUsers", listOfInactiveUsers);
		return "usersInfo";
	}

	@GetMapping("/allUsers")
	public String readAllUsers(Model model) {

		List<ProjectDto> listOfAllUsers = service.getAllUsers();

		if (listOfAllUsers == null) {
			model.addAttribute("fail", "Users Not Found");
			return "usersInfo";
		}
		model.addAttribute("listOfAllUsers", listOfAllUsers);
		return "usersInfo";
	}

}
