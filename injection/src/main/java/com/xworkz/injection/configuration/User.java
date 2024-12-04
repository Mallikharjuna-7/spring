package com.xworkz.injection.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Autowired
	@Qualifier("hp")
	private Laptop laptop;

	@Autowired
	@Qualifier("linux")
	private Os os;

	@Autowired
	@Qualifier("samsung")
	private Mobile mobile;

}
