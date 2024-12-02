package com.xworkz.traffic.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.traffic.configuration.TrafficConfiguration;

public class TrafficRunner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TrafficConfiguration.class);

		System.out.println(context.getBeanDefinitionCount());

		String instances[] = context.getBeanDefinitionNames();

		System.out.println(Arrays.toString(instances));
	}

}
