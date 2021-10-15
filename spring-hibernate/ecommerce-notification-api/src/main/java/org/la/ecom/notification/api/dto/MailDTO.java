package org.la.ecom.notification.api.dto;

import java.io.Serializable;

public class MailDTO implements Serializable{

	private static final long serialVersionUID = 8514174855190363931L;
	private String from;
    private String to;
    private String subject;
    private String bodyContent;
    private MailAttachmentDTO mailAttachment;
    
    public MailDTO() {
    }

    public MailDTO(String from, String to, String subject, MailAttachmentDTO mailAttachment, String bodyContent) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.mailAttachment = mailAttachment;
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

    public MailAttachmentDTO getMailAttachment() {
		return mailAttachment;
	}

	public void setMailAttachment(MailAttachmentDTO mailAttachment) {
		this.mailAttachment = mailAttachment;
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