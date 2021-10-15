package org.la.ecom.notification.api.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MailAttachmentDTO  implements Serializable {

	private static final long serialVersionUID = -16936147928303453L;
	
	private byte[] file;
	private String mimeType;
	private String fileName;
	
	public MailAttachmentDTO() {}
	
	public MailAttachmentDTO(byte[] file, String mimeType, String fileName) {
		this.fileName=fileName;
		this.file=file;
		this.mimeType = mimeType;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public byte[] getFile() {
		return file;
	}
	
	public void setFile(byte[] file) {
		this.file = file;
	}
	
}