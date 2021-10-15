package org.la.att.system.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "black_list_token")
public class BlackListToken {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "black_list_id")
    private int id;
    
    @Column(name = "create_date")
    private Date createDate;
    
    @Column(name = "token")
    private String token;

    public BlackListToken() {}
    
    public BlackListToken(Date createDate, String token) {
    	this.createDate = createDate;
    	this.token = token;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	@Override
    public String toString() {
    	return "roleid: "+id+"    createDate: "+createDate;
    }
}