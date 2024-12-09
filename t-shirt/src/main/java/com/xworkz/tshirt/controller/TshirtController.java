package com.xworkz.tshirt.controller;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TshirtController {

	public TshirtController() {
		System.out.println("Tshirt Controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {

		Set<String> tShirtBrands = new TreeSet<>();
		tShirtBrands.add("US Polo Assn");
		tShirtBrands.add("Allen Solly");
		tShirtBrands.add("Puma");
		tShirtBrands.add("Wrogn");
		tShirtBrands.add("Roadster");

		model.addAttribute("tShirt", tShirtBrands);
		return "success.jsp";
	}
}
