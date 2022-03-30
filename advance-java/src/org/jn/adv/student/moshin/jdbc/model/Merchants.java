package org.jn.adv.student.moshin.jdbc.model;

import java.time.LocalDate;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class Merchants {
	private Integer id;
	private String merchantName;
	private String adminId;
	private String countryCode;
	private LocalDate createdAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Merchants [id=" + id + ", merchantName=" + merchantName + ", adminId=" + adminId + ", countryCode="
				+ countryCode + ", createdAt=" + createdAt + "]";
	}
	

}
