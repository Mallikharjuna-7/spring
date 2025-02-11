package com.xworkz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.service.ProjectService;

@RequestMapping("/")
@Component
public class SignUpController {

	@Autowired
	private ProjectService service;

	@GetMapping("/signup")
	public String getResponse(@ModelAttribute ProjectDto dto, Model model) {

		boolean save = service.onSave(dto);

		if (!save) {
			model.addAttribute("fail", "Check entered details");
			return "signup";
		}
		return "signin";
	}


}
