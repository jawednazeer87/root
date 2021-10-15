package org.la.ecom.document.api.dto;

import java.io.Serializable;

public class DocumentsDTO implements Serializable{

	private static final long serialVersionUID = -5844113008336896873L;

	private String id;
	private String name;
	private String type;
	private long size;
	private byte[] contents;
	
	public DocumentsDTO() {}

	public DocumentsDTO(String id, String name, String type, long size, byte[] contents) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.size = size;
		this.contents = contents;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public byte[] getContents() {
		return contents;
	}

	public void setContents(byte[] contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Documents [id=" + id + ", name=" + name + "]";
	}

}