package org.jn.core.java.student.shoaeeb.collectn;

public class Book {
	private String author;
	private String subject;
	
	Book() {};
	Book(String author,String subject)
	{
		this.author=author;
		this.subject=subject;
	}
	
	//setters
	void setAuthor(String author)
	{
		this.author=author;
	}
	void setSubject(String subject)
	{
		this.subject=subject;
	}
	//getters
	
	String getAuthor() {
		return author;
	}
	String getSubject() {
		return subject;
	}
	@Override
	public String toString() {
		return " {author=" + author + ", subject=" + subject + "}";
	}
	
	
}
