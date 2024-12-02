package com.xworkz.december.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.december.configuration.DecemberConfiguration;

public class Runner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				DecemberConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());

		String instances[] = context.getBeanDefinitionNames();

		System.out.println(Arrays.toString(instances));
	}

}
