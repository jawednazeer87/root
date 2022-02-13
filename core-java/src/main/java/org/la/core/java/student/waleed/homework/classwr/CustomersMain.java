package org.la.core.java.student.waleed.homework.classwr;

import org.la.core.java.student.waleed.homework.classwr.model.Customers;

/**
 * @author Waleed Rizq
 *
 * @date Feb 6, 2022
 */
public class CustomersMain {


	public static void main(String[] args) {
		
		Customers customers = new Customers();
		customers.setCustomerId(11109);
	 customers.setFirstName("Khalid");
		 customers.setLastName("Saleh");
		 customers.setCategory("local") ;
		customers.setDoorNum(501);
	 customers.setAddress1(" Alnoor street 1007-block1");
	 customers.setAddress2(" 103-b1-north City");
		 customers.setCity("Madinah");
		 customers.setPostacode("500496");
	 customers.setCountry("Follow your Heart");
		 customers.setPhone(317008975);
		 customers.setFax(317008977);
		customers.setEmail("khalid@mailmoon.com");
		System.out.println("CustomerId : "+ customers.getCustomerId(  ));
		System.out.println(" FirstName : "+ customers.getFirstName(  ) );
		System.out.println("  LastNam : "+ customers.getLastName () );
		System.out.println(" Category : "+   customers.getCategory() );
		System.out.println("  DoorNum   : "+ customers.getDoorNum () );
		System.out.println("   Address1     : "+ customers.getAddress1()  );
		System.out.println("   Address2     : "+ customers.getAddress2()  );
		System.out.println("    City    : "+  customers.getCity()  );
		System.out.println("   Postacode     : "+ customers.getPostacode () );
		System.out.println("  Phone      : "+ customers.getPhone()   );
		System.out.println("     Fax   : "+  customers.getFax() );
		System.out.println("    Email    : "+ customers.getEmail()  );

	}

}
