package com.xworkz.autospare.seller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
@Table(name = "products_details")

@NamedQuery(name = "readAllProducts", query = "SELECT e FROM ProductEntity e")
@NamedQuery(name = "findProductsBySellerId", query = "SELECT e FROM ProductEntity e WHERE e.sellerDetails.id = :sellerId")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String productName;
    
    private String productCode;

    private String productDescription;

    private double price;
    
    private String productCategory;
    
    private int stockQuantity;
    
    private String supplierName;
    
    private String productImage;
    
    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)  // Use an appropriate foreign key name
    private SellerRegisterEntity sellerDetails;

}
