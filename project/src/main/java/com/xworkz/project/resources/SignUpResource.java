package com.xworkz.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.project.service.ProjectService;

@RestController
public class SignUpResource {

	@Autowired
	ProjectService service;

	@GetMapping("/getMail")
	public String isEmailPresent(@RequestParam String email) {
		if (service.getEmail(email) != null) {
			return "E-mail is already exist.";
		}
		return null;
	}

	@GetMapping("/getAadhar")
	public String isAadharPresent(@RequestParam String aadhar) {
		if (service.getAadhar(aadhar)) {
			return "Aadhar Number is already exist.";
		}
		return null;
	}
	
	@GetMapping("/getContact")
	public String isContactPresent(@RequestParam String contact) {
		if (service.getContact(contact)) {
			return "Contact Number is already exist.";
		}
		return null;
	}

}
