package org.la.ecom.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EcommerceSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceSchedulerApplication.class, args);
	}

}
