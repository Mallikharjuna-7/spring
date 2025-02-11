package com.xworkz.project.admin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
@Table(name = "admin")

@NamedQuery(name = "adminAuthentication", query = "SELECT e FROM AdminEntity e WHERE e.adminEmail = :adminEmail AND e.password = :password")
public class AdminEntity {
	
	@Id
	private int id;
	
	private int adminId;
	
	private String adminName;
	
	private String adminEmail;
	
	private String password;

}
