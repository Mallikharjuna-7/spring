package com.rgb.color.controller;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ColorController {

	public ColorController() {
		System.out.println("color controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {

		Map<Integer, String> colors = new TreeMap<>();

		colors.put(1, "Blue");
		colors.put(2, "White");
		colors.put(3, "Green");
		colors.put(4, "Red");
		colors.put(5, "Orange");

		model.addAttribute("color", colors);
		return "success.jsp";
	}

}
