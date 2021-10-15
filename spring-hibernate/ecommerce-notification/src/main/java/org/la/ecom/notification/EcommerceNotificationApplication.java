package org.la.ecom.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class EcommerceNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceNotificationApplication.class, args);
	}

}
