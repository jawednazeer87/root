package org.la.ecom.secure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class EcommerceSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceSecurityApplication.class, args);
	}

}
