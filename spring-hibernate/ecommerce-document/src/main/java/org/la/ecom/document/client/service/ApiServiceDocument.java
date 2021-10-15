package org.la.ecom.document.client.service;

import javax.annotation.PostConstruct;

import org.la.ecom.mysql.api.client.MysqlClient;
import org.la.ecom.notification.api.client.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceDocument {

	@Value("${service.url.notifications}")
	private String notificationURL;
	
	@Value("${service.url.mysql}")
	private String mysqlURL;

	@Autowired
	private NotificationClient notificationClient;
	
	@Autowired
	private MysqlClient mysqlClient;
	
	public ApiServiceDocument() {}
	
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
	}
	
	
}
