package org.la.ecom.secure.client.service;

import javax.annotation.PostConstruct;

import org.la.ecom.document.api.client.DocumentClient;
import org.la.ecom.mysql.api.client.MysqlClient;
import org.la.ecom.notification.api.client.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceSecurity {

	@Value("${service.url.notifications}")
	private String notificationURL;
	
	@Value("${service.url.mysql}")
	private String mysqlURL;

	@Value("${service.url.documents}")
	private String documentURL;
	
	@Autowired
	private NotificationClient notificationClient;
	
	@Autowired
	private MysqlClient mysqlClient;
	
	@Autowired
	private DocumentClient documentClient;
	
	public ApiServiceSecurity() {}
	
	public NotificationClient notificationClient() {
		return notificationClient;
	}
	
	public MysqlClient mysqlClient() {
		return mysqlClient;
	}
	
	@PostConstruct
	public void setPropertiesUrl() {
		notificationClient.setUrl(notificationURL);
		mysqlClient.setUrl(mysqlURL);
		documentClient.setUrl(documentURL);
	}
	
}
