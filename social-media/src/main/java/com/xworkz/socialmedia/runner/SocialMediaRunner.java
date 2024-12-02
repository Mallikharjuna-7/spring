package com.xworkz.socialmedia.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.socialmedia.configuration.SocialMediaConfiguration;

public class SocialMediaRunner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SocialMediaConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());

		String instances[] = context.getBeanDefinitionNames();

		System.out.println(Arrays.toString(instances));
	}

}
