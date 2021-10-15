package org.la.ecom.mysql.api.dto;

import java.io.Serializable;

public class MailFormatDTO implements Serializable{

	private static final long serialVersionUID = -2355046018168665695L;
	
	private long id;
	private long mailTypeId;
	private String from;
	private String subject;
	private String bodyContent;
	
	public MailFormatDTO() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMailTypeId() {
		return mailTypeId;
	}

	public void setMailTypeId(long mailTypeId) {
		this.mailTypeId = mailTypeId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodyContent() {
		return bodyContent;
	}

	public void setBodyContent(String bodyContent) {
		this.bodyContent = bodyContent;
	}
	
}
