package com.xworkz.googleapps.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Component
public class GoogleAppsController {

	public GoogleAppsController() {
		System.out.println("Google apps controller");
	}

	@GetMapping("/submit")
	public String getResponse(@RequestParam String appName, @RequestParam String description, @RequestParam int appSize,
			@RequestParam String appOfferedBy, @RequestParam int appRating, @RequestParam int appDownloads,
			Model model) {

		model.addAttribute("appName", appName);
		model.addAttribute("description", description);
		model.addAttribute("appSize", appSize);
		model.addAttribute("appOfferedBy", appOfferedBy);
		model.addAttribute("appRating", appRating);
		model.addAttribute("downloads", appDownloads);
		return "success.jsp";
	}

}
