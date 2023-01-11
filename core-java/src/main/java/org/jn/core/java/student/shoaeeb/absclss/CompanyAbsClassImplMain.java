package org.jn.core.java.student.shoaeeb.absclss;

public class CompanyAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyAbsClass abs = new CompanyAbsClassImpl();
		abs.setCompanyId(1);
		abs.setName("xyz");
		abs.setDescription("description");
		
		System.out.println("id: "+abs.getCompanyId()+" name: "+abs.getName()+" Description: "+abs.getDescription());
	}

}
