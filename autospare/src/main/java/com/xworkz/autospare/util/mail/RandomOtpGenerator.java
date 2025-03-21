package com.xworkz.autospare.util.mail;

import java.security.SecureRandom;

public class RandomOtpGenerator {
	
	private RandomOtpGenerator() {
		
	}
	
	public static int generateOTP() {
		 SecureRandom random = new SecureRandom();
	        return 100000 + random.nextInt(900000);
	}

}
