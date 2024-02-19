package com.silva.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
public class ScanApp implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationProperties.class, args);
	}

	@Override
	public void run(final ApplicationArguments args) throws Exception {

		System.out.println("Bean = " + "---");

	}
}
