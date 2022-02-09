package org.la.core.java.student.majeed.classes.model;

public class Ticket {
	private int ticketNumber;
	private String ticketType;
	private Customer customer;
	private Trip trip;	

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public void printTicket() {
		System.out.println("ticketNumber : "+ticketNumber);
		System.out.println("ticketType : "+ticketType);
	}
}
