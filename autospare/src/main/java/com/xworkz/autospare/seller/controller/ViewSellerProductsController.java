package com.xworkz.autospare.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.seller.dto.ProductDto;
import com.xworkz.autospare.seller.service.SellerService;

@RequestMapping("/")
@Component
public class ViewSellerProductsController {

	@Autowired
	private SellerService service;

	@GetMapping("/viewSellerProducts")
	public String getSellerProducts(@RequestParam int id, Model model) {

		List<ProductDto> listOfSellerProducts = service.findBySellerId(id);

		if (listOfSellerProducts != null) {

			System.out.println("Products checkinggggggggggg :" + listOfSellerProducts);

			model.addAttribute("listOfSellerProducts", listOfSellerProducts);
			return "sellerHome";
		}
		return "sellerHome";
	}

}
