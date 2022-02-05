package org.la.core.java.student.tanseer.assignment8.classes;

public class Books 
{
	public String bookName ;
	public int pages;
	public double version;
	public String author;
	
	public void print()
	{
		System.out.println("Book Name : \t"+ bookName);
		System.out.println("No of pages : \t"+ pages);
		System.out.println("Book Version : \t"+version);
		System.out.println("Author : \t"+author);
	}
}
