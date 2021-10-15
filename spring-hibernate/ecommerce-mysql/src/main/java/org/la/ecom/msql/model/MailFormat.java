package org.la.ecom.msql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mail_format")
public class MailFormat implements Serializable{
	
	private static final long serialVersionUID = -8785114358690748536L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="mail_type_id")
	private int mailTypeId;
	
	@Column(name="from_mail")
	private String from;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="body")
	private String bodyContent;
	
	public MailFormat() {}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMailTypeId() {
		return mailTypeId;
	}

	public void setMailTypeId(int mailTypeId) {
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