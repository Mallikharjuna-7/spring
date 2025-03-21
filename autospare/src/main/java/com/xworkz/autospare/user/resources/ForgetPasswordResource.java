package com.xworkz.autospare.user.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.autospare.user.service.UserService;

@RestController
public class ForgetPasswordResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/isEmailPresent")
	public String isEmailPresent(@RequestParam String email) {
		if (service.getEmail(email) != null) {
			return "";
		}
		return "Account not found";
	}
	
	@GetMapping("/forOtp")
	public String generateOTP(@RequestParam String email) {
		if(email != null) {
			boolean result = service.sendOtp(email);
			if(result) {
				return "";
			}
		}
		return "OTP not sent";
	}

}
