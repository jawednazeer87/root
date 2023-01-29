package org.jn.core.java.student.shoaeeb.book;

public class EpsonPrinter implements MyInterface{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Epson Printer");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnecting....");
		
	}
	
}
