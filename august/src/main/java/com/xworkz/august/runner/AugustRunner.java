package com.xworkz.august.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.august.configuration.AugustConfiguration;

public class AugustRunner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AugustConfiguration.class);

		System.out.println(context.getBeanDefinitionCount());

		String instances[] = context.getBeanDefinitionNames();

		System.out.println(Arrays.toString(instances));
	}

}
