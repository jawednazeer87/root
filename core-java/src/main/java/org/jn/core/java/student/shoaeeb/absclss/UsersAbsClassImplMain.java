package org.jn.core.java.student.shoaeeb.absclss;

public class UsersAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersAbsClass abs = new UsersAbsClassImpl();
		abs.setId(1);
		abs.setFullName("john");
		abs.setEmail("john@gmail.com");
		abs.setCountryCode(5);
		
		System.out.println("Id: "+abs.getId()+" FullName: "+abs.getFullName()+" Email: "+abs.getEmail()+" country code: "+abs.getCountryCode());
		}

}
