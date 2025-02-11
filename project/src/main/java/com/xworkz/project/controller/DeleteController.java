package com.xworkz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.service.ProjectService;

@RequestMapping("/")
@Component
public class DeleteController {
	
	@Autowired
	private ProjectService service;
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam String email, Model model) {
		
		ProjectDto dto = service.findByEmail(email);
		boolean delete = service.deleteByEmail(dto);		
		if(delete) {
			return "signin";
		}
		return "userHome";
	}

}
