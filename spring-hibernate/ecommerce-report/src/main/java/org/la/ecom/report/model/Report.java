package org.la.ecom.report.model;

import java.io.Serializable;

public class Report implements Serializable {
	
	private static final long serialVersionUID = 4791769281028648368L;
	
	private String type; 
	private byte[] content;
	private String name;
	private String mimeType;
	private String size;
	
	public Report() {}
	
	public Report(String type, byte[] content, String name, String mimeType, String size) {
		super();
		this.type = type;
		this.content = content;
		this.name = name;
		this.mimeType = mimeType;
		this.size = size;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}