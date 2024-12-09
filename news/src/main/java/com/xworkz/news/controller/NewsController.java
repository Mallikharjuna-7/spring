package com.xworkz.news.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.news.dto.NewsDto;

@Component
@RequestMapping("/")
public class NewsController {

	public NewsController() {
		System.out.println("news controller");
	}

	@GetMapping("/submit")
	public String getResponse(Model model) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NewsDto.class);
		Object dto = context.getBean(NewsDto.class);

		model.addAttribute("news", dto);
		return "success.jsp";
	}

}
