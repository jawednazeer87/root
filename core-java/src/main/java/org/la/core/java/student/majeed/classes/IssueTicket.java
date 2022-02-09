package org.la.core.java.student.majeed.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.la.core.java.student.majeed.classes.model.*;

public class IssueTicket {

	public static void main(String[] args) throws ParseException {
		Ticket ticket = new Ticket();
		ticket.setTicketNumber(1001);
		ticket.setTicketType("Adult");
		
		Customer customer = new Customer();
		String dob="21/12/1990";  
	    Date dob1=new SimpleDateFormat("dd/MM/yyyy").parse(dob);  
	    
		customer.setIdNumber("A12345");
		customer.setName("Mohammed");
		customer.setIdType("Passport");
		customer.setDob(dob1);
		customer.setNationality("Indian");
		ticket.setCustomer(customer);
		
		Trip trip = new Trip();
		String tripDate="01/02/2022";  
	    Date tripDate1=new SimpleDateFormat("dd/MM/yyyy").parse(tripDate);  		
		trip.setTripNumber(5001);
		trip.setTripDate(tripDate1);
		trip.setFromStation("Hyderabad");
		trip.setToStation("Mumbai");
		
		ticket.printTicket();
		customer.printCustomer();
		trip.printTrip();

	}

}
