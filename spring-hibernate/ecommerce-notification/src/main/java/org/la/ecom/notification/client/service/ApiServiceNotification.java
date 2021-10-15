package org.la.ecom.notification.client.service;

import javax.annotation.PostConstruct;

import org.la.ecom.document.api.client.DocumentClient;
import org.la.ecom.mysql.api.client.MysqlClient;
import org.la.ecom.report.api.client.ReportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceNotification {

	@Value("${service.url.documents}")
	private String documentURL;
	
	@Value("${service.url.mysql}")
	private String mysqlURL;

	@Value("${service.url.report}")
	private String reportURL;
	
	@Autowired
	private DocumentClient documentClient;
	
	@Autowired
	private MysqlClient mysqlClient;
	
	@Autowired
	private ReportClient reportClient;
	
	public ApiServiceNotification() {}
	
	public ReportClient reportClient() {
		return reportClient;
	}
	
	public DocumentClient documentClient() {
		return documentClient;
	}
	
	public MysqlClient mysqlClient() {
		return mysqlClient;
	}
	
	@PostConstruct
	public void setPropertiesUrl() {
		documentClient.setUrl(documentURL);
		mysqlClient.setUrl(mysqlURL);
		reportClient.setUrl(reportURL);
	}
	
}