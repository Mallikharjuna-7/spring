package com.xworkz.autospare.util.mail;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
	
	@Bean
	public JavaMailSender mailSettings() {
		
		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
		javaMailSender.setUsername("mallikharjuna.xworkz@gmail.com");
		javaMailSender.setHost("smtp.gmail.com");
		javaMailSender.setPort(587);
		javaMailSender.setPassword("fbxh peoa ytjw njoz");
		Properties properties = javaMailSender.getJavaMailProperties();
		properties.put("mail.trasport.protocol", "smtp");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		
		return javaMailSender;
	}
	
	public void sendOtp(int otp, String email,String username) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("mallikharjuna.xworkz@gmail.com");
		message.setTo(email);
		message.setSubject("OTP for Reset Password");
		message.setText("Hello"+" "+ username +","+"\n" +"Your OTP for Password Reset is" +" :" +otp);
		
		JavaMailSender sender = mailSettings();
		sender.send(message);
	}
	
	public void sendWelcomeMessage(String email, String username) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("mallikharjuna.xworkz@gmail.com");
		message.setTo(email);
		message.setSubject("Welcome to AutoSpare");
		message.setText("Hello"+" "+ username +","+"\n" +"Welcome to Mspares(Automotive parts).."+"\n"+"Your registration request is in pending, wait for admin approval.");
		
		JavaMailSender sender = mailSettings();
		sender.send(message);
	}
	
	public void sendApprovedMessage(String email, String username) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("mallikharjuna.xworkz@gmail.com");
		message.setTo(email);
		message.setSubject("Request Approved for AutoSpare");
		message.setText("Hello"+" "+ username +","+"\n" +"Welcome to Mspares(Automotive parts).."+"\n"+"Your request for seller account is approved. Now you can login your account.");
		
		JavaMailSender sender = mailSettings();
		sender.send(message);
	}
	
	public void sendRejectedMessage(String email, String username) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("mallikharjuna.xworkz@gmail.com");
		message.setTo(email);
		message.setSubject("Request Rejected for AutoSpare");
		message.setText("Hello"+" "+ username +","+"\n" +"Your request for seller account is rejected.");
		
		JavaMailSender sender = mailSettings();
		sender.send(message);
	}
	
	public void sendLoginOTP(int otp,String email,String username) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("mallikharjuna.xworkz@gmail.com");
		message.setTo(email);
		message.setSubject("OTP for Login");
		message.setText("Hello"+" "+ username +","+"\n" +"Your OTP for Login is" +" :" +otp);
		
		JavaMailSender sender = mailSettings();
		sender.send(message);
	}

}
