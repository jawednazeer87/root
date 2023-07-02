package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zoo")
public class Zoo {

	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		@Column(name= "name")
		private String name;
		
		@Column(name="foundation_date")
		private Date foundationDate;
		@Column(name="inauguration_date")
		private Date inaugurationDate;
		@Column(name="email_aoo_authority")
		private String emailZooAuthority;
		
		public Zoo() {}

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

		public Date getFoundationDate() {
			return foundationDate;
		}

		public void setFoundationDate(Date foundationDate) {
			this.foundationDate = foundationDate;
		}

		public Date getInaugurationDate() {
			return inaugurationDate;
		}

		public void setInaugurationDate(Date inaugurationDate) {
			this.inaugurationDate = inaugurationDate;
		}

		public String getEmailZooAuthority() {
			return emailZooAuthority;
		}

		public void setEmailZooAuthority(String emailZooAuthority) {
			this.emailZooAuthority = emailZooAuthority;
		}

		@Override
		public String toString() {
			return "{id=" + id + ", name=" + name + ", foundationDate=" + foundationDate + ", inaugurationDate="
					+ inaugurationDate + ", emailZooAuthority=" + emailZooAuthority + "}";
		}
		
		
}
