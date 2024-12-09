package com.skybags.bags.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BagsController {

	public BagsController() {
		System.out.println("bags controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {

		List<String> list = new ArrayList<>();
		list.add("Skybags");
		list.add("American Tourister");
		list.add("Wildcraft");
		list.add("Safari");

		model.addAttribute("listOfBags", list);

		return "success.jsp";
	}
}
