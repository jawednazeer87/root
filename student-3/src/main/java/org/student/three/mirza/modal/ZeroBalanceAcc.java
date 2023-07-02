package org.student.three.mirza.modal;


	import java.util.Date;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table (name ="zero_balance_acc")
	public class ZeroBalanceAcc {

	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		@Column(name= "name")
		private String name;
		@Column(name= "user_id")
		private long userId;
		@Column(name= "expiry_date")
		private Date expiryDate;
		@Column(name="created_date")
		private Date createdDate;
		@Column(name ="bank_name")
        private String bankName;
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
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public Date getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
		}
		public Date getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		@Override
		public String toString() {
			return " {id=" + id + ", name=" + name + ", userId=" + userId + ", expiryDate=" + expiryDate
					+ ", createdDate=" + createdDate + ", bankName=" + bankName + "}";
		}
		public void delete(ZeroBalanceAcc zeroBalanceAcc) {
			// TODO Auto-generated method stub
			
		}
		
		
}
