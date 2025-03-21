package com.xworkz.autospare.user.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Component
@Table(name = "user_signin")

public class UserSigninEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int userId;

	private LocalDateTime signInTime;

}
