package com.aarti.firstSelenium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestFirstSeleniumApplication {

	public static void main(String[] args) {
		SpringApplication.from(FirstSeleniumApplication::main).with(TestFirstSeleniumApplication.class).run(args);
	}

}
