package com.example.smsNexus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.smsNexus.Repository")
@SpringBootApplication
public class SmsNexusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsNexusApplication.class, args);
	}

}
