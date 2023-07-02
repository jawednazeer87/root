package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="pizza")
public class Pizza {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    @Column (name ="name")
    private String name;
    @Column (name ="created_date")
    private Date createdDate;
    @Column (name = "expiry_date")
    private Date expiryDate;
    @Column (name ="type")
    private String type;
    @Column (name ="is_halal")
    private boolean isHalal;
    
    public Pizza() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isHalal() {
		return isHalal;
	}

	public void setHalal(boolean isHalal) {
		this.isHalal = isHalal;
	}

	@Override
	public String toString() {
		return " {id=" + id + ", name=" + name + ", createdDate=" + createdDate + ", expiryDate=" + expiryDate
				+ ", type=" + type + ", isHalal=" + isHalal + "}";
	}
    
    

}
