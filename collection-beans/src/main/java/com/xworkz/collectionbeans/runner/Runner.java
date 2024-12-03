package com.xworkz.collectionbeans.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.collectionbeans.configuration.CollectionMapConfiguration;

public class Runner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				CollectionMapConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());

//		String instances[] = context.getBeanDefinitionNames();

//		System.out.println(Arrays.toString(instances));

		Object list = context.getBean("getList");
		System.out.println(list);

	}

}
