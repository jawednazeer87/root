package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name  ="monitor_wide")
public class MonitorWide {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	                  //orgName, modelNo, orgEmail, created_date, screenSize, length, breadth 
	@Column  (name ="org_name")
	private String orgName;
	@Column  (name ="model_no")
	private String modelNo;
	@Column  (name =" org_email")
	private String orgEmail;
	@Column  (name ="created_date")
	private Date createdDate;
	@Column  (name = "screen_size")
	private int screenSize;
	@Column  (name = "length")
	private long length;
	@Column  (name = "breadth")
	private long breadth;
	
	public MonitorWide() {}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getOrgEmail() {
		return orgEmail;
	}
	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public long getBreadth() {
		return breadth;
	}
	public void setBreadth(long breadth) {
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "  {id=" + id + ", orgName=" + orgName + ", modelNo=" + modelNo + ", orgEmail=" + orgEmail
				+ ", createdDate=" + createdDate + ", screenSize=" + screenSize + ", length=" + length + ", breadth="
				+ breadth + "}";
	}
    
	
	
}
