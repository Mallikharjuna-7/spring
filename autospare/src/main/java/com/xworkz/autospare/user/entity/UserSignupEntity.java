package com.xworkz.autospare.user.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
@Table(name = "user_signup")

@NamedQuery(name = "authentication", query = "SELECT e FROM UserSignupEntity e WHERE e.email = :email AND e.password = :password")
@NamedQuery(name = "findEmail", query = "SELECT e FROM UserSignupEntity e WHERE e.email = :email")
@NamedQuery(name = "findAadhar", query = "SELECT e FROM UserSignupEntity e WHERE e.aadhar = :aadhar")
@NamedQuery(name = "findContact", query = "SELECT e FROM UserSignupEntity e WHERE e.contact = :contact")
@NamedQuery(name = "readActiveUsers", query = "SELECT e FROM UserSignupEntity e WHERE e.userStatus = 'active'")
@NamedQuery(name = "readInactiveUsers", query = "SELECT e FROM UserSignupEntity e WHERE e.userStatus = 'inactive'")
@NamedQuery(name = "readAllUsers", query = "SELECT e FROM UserSignupEntity e")

public class UserSignupEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;

	private String username;

	private String email;

	private String contact;

	private String password;

	private String aadhar;

	@Column(name = "DateOfBirth")
	private String dob;

	private String alternativeContact;

	private String country;

	private String state;

	private String city;

	private int pincode;

	private String address;

	private String createdBy;

	private LocalDateTime createdOn;

	private String updatedBy;

	private LocalDateTime updatedOn;
	
	private String userStatus;
	
	private int signinFailCount;
	
	private int otp;
	
	private LocalDateTime otpGeneratedTime;

}
