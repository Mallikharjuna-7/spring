package com.xworkz.bike.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bike.configuration.BikeConfiguration;

public class BikeRunner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BikeConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());

		String instances[] = context.getBeanDefinitionNames();

		System.out.println(Arrays.toString(instances));

	}

}
