package com.xworkz.autospare.seller.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
@Table(name = "seller_registration")

@NamedQuery(name = "readAllSellers", query = "SELECT e FROM SellerRegisterEntity e")
@NamedQuery(name = "readApprovedSellers", query = "SELECT e FROM SellerRegisterEntity e WHERE e.requestStatus = 'approved'")
@NamedQuery(name = "readPendingSellers", query = "SELECT e FROM SellerRegisterEntity e WHERE e.requestStatus = 'pending'")
@NamedQuery(name = "findBySellerId", query = "SELECT e FROM SellerRegisterEntity e WHERE e.id = :id")
@NamedQuery(name = "findBySellerEmail", query = "SELECT e FROM SellerRegisterEntity e WHERE e.sellerEmail = :sellerEmail")
@NamedQuery(name = "loginSeller", query = "SELECT e FROM SellerRegisterEntity e WHERE e.sellerEmail = :sellerEmail AND e.otp = :otp")

public class SellerRegisterEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	
	private String sellerName;
	
	private String sellerEmail;
	
	private String sellerContact;
	
	private String industryName;
	
	private String gstNumber;
	
	private String typeOfIndustry;
	
	private String isOnlineServiceAvailable;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private String address;
	
	private String pincode;
	
	@OneToMany(mappedBy = "sellerDetails")
	private List<ProductEntity> productDetails;
	
	private String createdBy;
	
	private LocalDateTime createdOn;
	
	private String updatedBy;
	
	private LocalDateTime updatedOn;
	
	private String activeStatus;
	
	private String requestStatus;
	
	private int otp;

}
