package com.bakery.cake.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CakeController {

	public CakeController() {
		System.out.println("Cake Controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {
		model.addAttribute("cake", "ButterScotch Cake");
		return "success.jsp";
	}

}
