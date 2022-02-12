package org.la.core.java.student.waleed.homework.classwr.model;

import java.time.LocalDate;

/**
 * @author Waleed Rizq
 *
 * @date Feb 6, 2022
 */
public class Works {
	private String wfdept;
	private String whours;
	private LocalDate sdate;
	
	public Works(String wdept, String whours , LocalDate sdate ) {
		
		this.wfdept= wdept;
		this.whours = whours;
		this.sdate = sdate;
		
		
	}

	public String getWfdept() {
		return wfdept;
	}

	public void setWfdept(String wfdept) {
		this.wfdept = wfdept;
	}

	public String getWhours() {
		return whours;
	}

	public void setWhours(String whours) {
		this.whours = whours;
	}

	public LocalDate getSdate() {
		return sdate;
	}

	public void setSdate(LocalDate sdate) {
		this.sdate = sdate;
	}

	
	public void print () {
		
		System.out.println(" Works info");
		System.out.println(" Work for department  : "+wfdept);
		System.out.println("  Work hours : "+ whours);
		System.out.println(" Start Date  : "+ sdate);
		System.out.println();
		
	}

}
