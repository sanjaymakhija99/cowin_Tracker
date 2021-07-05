package com.crazyengg.umcvaxtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
// This is used for vaccine Tracker
public class UlhasnagarVaccineTrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(UlhasnagarVaccineTrackerApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public void add() {
		System.out.println("hello");
	}

}
