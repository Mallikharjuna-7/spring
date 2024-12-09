package com.xworkz.metaapps.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.metaapps.dto.MetaAppsDto;

@RequestMapping("/")
@Component
public class MetaAppsController {

	@GetMapping("/submit")
	public String getResponse(@ModelAttribute MetaAppsDto dto, Model model) {
		model.addAttribute("MetaDto", dto);
		return "success.jsp";
	}

}
