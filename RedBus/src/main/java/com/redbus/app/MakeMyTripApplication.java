package com.redbus.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MakeMyTripApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeMyTripApplication.class, args);
	}
	
	@Bean
	public RestTemplate restT()
	{
		RestTemplate rs = new RestTemplate();
		return rs;
	}

}
