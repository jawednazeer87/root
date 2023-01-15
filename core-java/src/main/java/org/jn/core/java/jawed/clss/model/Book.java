package org.jn.core.java.jawed.clss.model;

public class Book implements Comparable<Book> {

	private int price;
	private String name;
	private String subject;
	
	public Book() {}
	
	public Book(int price, String name, String subject) {
		this.price = price;
		this.name = name;
		this.subject = subject;
	}

	public void setPrice(int pr) {
		price = pr;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String pr) {
		name = pr;
	}
	public String getName() {
		return name;
	}
	public void setSubject(String sbj) {
		subject = sbj;
	}
	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "{price: " + price + ", name: " + name + ", subject: " + subject + "}\n";
	}

	@Override
	public int compareTo(Book o) {
		return name.compareTo(o.name);
	}
	
}
