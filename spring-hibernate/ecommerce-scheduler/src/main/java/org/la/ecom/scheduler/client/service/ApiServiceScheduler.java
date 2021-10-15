package org.la.ecom.scheduler.client.service;

import javax.annotation.PostConstruct;

import org.la.ecom.document.api.client.DocumentClient;
import org.la.ecom.mysql.api.client.MysqlClient;
import org.la.ecom.notification.api.client.NotificationClient;
import org.la.ecom.scheduler.client.SecurityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceScheduler {

	@Value("${service.url.documents}")
	private String documentURL;
	
	@Value("${service.url.mysql}")
	private String mysqlURL;
	
	@Value("${service.url.security}")
	private String securityURL;
	
	@Value("${service.url.notifications}")
	private String notificationURL;
	
	@Autowired
	private DocumentClient documentClient;
	
	@Autowired
	private MysqlClient mysqlClient;
	
	@Autowired
	private SecurityClient securityClient;
	
	@Autowired
	private NotificationClient notificationClient;
	
	public ApiServiceScheduler() {}
	
	public NotificationClient notificationClient() {
		return notificationClient;
	}
	
	public DocumentClient documentClient() {
		return documentClient;
	}
	
	public MysqlClient mysqlClient() {
		return mysqlClient;
	}
	
	public SecurityClient securityClient() {
		return securityClient;
	}
	
	@PostConstruct
	public void setPropertiesUrl() {
		documentClient.setUrl(documentURL);
		mysqlClient.setUrl(mysqlURL);
		securityClient.setUrl(securityURL);
		notificationClient.setUrl(notificationURL);
	}
	
}