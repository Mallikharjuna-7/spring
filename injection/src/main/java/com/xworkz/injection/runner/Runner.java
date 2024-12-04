package com.xworkz.injection.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.injection.configuration.Configuration;
import com.xworkz.injection.configuration.User;

public class Runner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		System.out.println("beans count :" + context.getBeanDefinitionCount());
		String beans[] = context.getBeanDefinitionNames();

		for (String b : beans) {
			System.out.println(b);
		}

		System.out.println(context.getBean(User.class));
	}

}
