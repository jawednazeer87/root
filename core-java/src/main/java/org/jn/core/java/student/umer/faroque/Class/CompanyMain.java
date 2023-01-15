package org.jn.core.java.student.umer.faroque.Class;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company();
		com.setCompanyId(12);
		com.setName("AVC");
		com.setDescription("Software Company ");
		
		System.out.println(com.getCompanyId());
		System.out.println(com.getName());
		System.out.println(com.getDescription());
	}

}
