package org.la.ecom.secure.config;

import org.la.ecom.document.api.client.DocumentClient;
import org.la.ecom.mysql.api.client.MysqlClient;
import org.la.ecom.notification.api.client.NotificationClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AppSecurityConfiguration {

	@Bean
    public RestTemplate restTemplate() {
		
        RestTemplate restTemplate = new RestTemplate();
    
        return restTemplate;
    }
	
	@Bean
	public NotificationClient notificationClient() {
		return new NotificationClient();
	}
	
	@Bean
	public MysqlClient mysqlClient() {
		return new MysqlClient();
	}
	
	@Bean
	public DocumentClient documentClient() {
		return new DocumentClient();
	}
	
}
