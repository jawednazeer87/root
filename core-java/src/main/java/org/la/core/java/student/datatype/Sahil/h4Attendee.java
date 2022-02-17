package org.la.core.java.student.datatype.Sahil;

public class h4Attendee {
	 
		int Attendeeid;
		String FirstName;
		String LastName;
		long phoneNum;
	    String Email;
	    
		
		void Setters(int Attendeeid ,String FirstName,String LastName,long phoneNum,String Email) {
			
			Attendeeid=456;
			FirstName="MD SAHIL";
			LastName= "HAIDER";
			phoneNum = 8240621;
			Email="Sahilhaider@mail.commm";
			
			}
		void dipslay() {
			System.out.println("Attendeeid : "+Attendeeid);
			System.out.println("FirstName : "+FirstName);
			System.out.println("LastName : "+ LastName);
			System.out.println("PhoneNum : "+phoneNum);
			System.out.println("Email : "+Email);
			
		}
		
		
}
