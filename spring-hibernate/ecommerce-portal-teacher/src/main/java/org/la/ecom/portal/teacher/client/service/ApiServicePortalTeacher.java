package org.la.ecom.portal.teacher.client.service;

import javax.annotation.PostConstruct;

import org.la.ecom.document.api.client.DocumentClient;
import org.la.ecom.mysql.api.client.MysqlClient;
import org.la.ecom.notification.api.client.NotificationClient;
import org.la.ecom.report.api.client.ReportClient;
import org.la.ecom.secure.api.client.SecurityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiServicePortalTeacher {

	@Value("${service.url.security}")
	private String securityURL;
	
	@Value("${service.url.notifications}")
	private String notificationURL;
	
	@Value("${service.url.mysql}")
	private String mysqlURL;
	
	@Value("${service.url.documents}")
	private String documentURL;
	
	@Value("${service.url.report}")
	private String reportURL;

	@Autowired
	private SecurityClient securityClient;
	
	@Autowired
	private NotificationClient notificationClient;
	
	@Autowired
	private MysqlClient mysqlClient;
	
	@Autowired
	private DocumentClient documentClient;
	
	@Autowired
	private ReportClient reportClient;
	
	public ApiServicePortalTeacher() {}
	
	public NotificationClient notificationClient() {
		return notificationClient;
	}
	
	public SecurityClient securityClient() {
		return securityClient;
	}
	
	public MysqlClient mysqlClient() {
		return mysqlClient;
	}
	
	public DocumentClient documentClient() {
		return documentClient;
	}
	
	public ReportClient reportClient() {
		return reportClient;
	}
	
	@PostConstruct
	public void setPropertiesUrl() {
		notificationClient.setUrl(notificationURL);
		mysqlClient.setUrl(mysqlURL);
		documentClient.setUrl(documentURL);
		reportClient.setUrl(reportURL);
		securityClient.setUrl(securityURL);
	}
	
	
}
