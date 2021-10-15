package org.la.att.system.model;

import java.util.Date;

public class ErrorMessage {

    private Date timestamp;
    private int status;
    private String message;
    private String error;
    private String path;
    
    public ErrorMessage() {}
    
	public ErrorMessage(Date timestamp, int status, String message, String error, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.error = error;
		this.path = path;
	}

	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
    
}
