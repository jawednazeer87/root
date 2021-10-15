package org.la.ecom.msql.client.service;

import javax.annotation.PostConstruct;

import org.la.ecom.document.api.client.DocumentClient;
import org.la.ecom.notification.api.client.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceMysql {

	@Value("${service.url.notifications}")
	private String notificationURL;
	
	@Value("${service.url.documents}")
	private String documentURL;

	@Autowired
	private NotificationClient notificationClient;
	
	@Autowired
	private DocumentClient documentClient;
	
	public ApiServiceMysql() {}

	
	public NotificationClient notificationClient() { return notificationClient; }
	  
	public DocumentClient documentClient() { return documentClient; }
	 
	@PostConstruct
	public void setPropertiesUrl() {
		notificationClient.setUrl(notificationURL);
		documentClient.setUrl(documentURL);
	}
	
	
}
