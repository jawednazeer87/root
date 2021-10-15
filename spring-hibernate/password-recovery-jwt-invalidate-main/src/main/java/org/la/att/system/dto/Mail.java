package org.la.att.system.dto;

import java.io.Serializable;

public class Mail implements Serializable{

	private static final long serialVersionUID = 8514174855190363931L;
	
	private String from;
    private String to;
    private String subject;
    private String bodyContent;
    
    public Mail() {
    }

    public Mail(String from, String to, String subject, String bodyContent) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.bodyContent = bodyContent;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
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

	@Override
    public String toString() {
        return "Mail{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", bodyContent='" + bodyContent + '\'' +
                '}';
    }
}