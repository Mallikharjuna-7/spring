package com.xworkz.news.dto;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class NewsDto {

	@Value("TV9")
	private String chennelName;

	@Value("Breaking News")
	private String newsTitle;

	@Value("No Description")
	private String description;

	@Value("Mallikharjun")
	private String author;

	@Value("55555")
	private int views;

}
