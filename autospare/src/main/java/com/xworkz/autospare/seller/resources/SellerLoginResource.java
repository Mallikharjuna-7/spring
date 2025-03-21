package com.xworkz.autospare.seller.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.autospare.seller.dto.SellerRegisterDto;
import com.xworkz.autospare.seller.service.SellerService;

@RestController
public class SellerLoginResource {

	@Autowired
	private SellerService service;

	@GetMapping("/isSellerPresent")
	public String isSellerPresent(@RequestParam String email) {
		SellerRegisterDto dto = service.findByEmail(email);
		if (dto != null) {
			if (dto.getRequestStatus().equalsIgnoreCase("approved")) {

				return "Account verified";
			}
			return "Account not verified";
		}
		return "Account not found";
	}

	@GetMapping("/sendLoginOtp")
	public String generateOTP(@RequestParam String email) {
		if (email != null) {
			boolean result = service.sendLoginOtp(email);

			return "OTP sent";

		}
		return "OTP not sent";
	}

}
