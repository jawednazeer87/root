package org.la.ecom.msql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class EcommerceMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceMysqlApplication.class, args);
	}

}
