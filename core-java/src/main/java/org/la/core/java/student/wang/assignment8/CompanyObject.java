package org.la.core.java.student.wang.assignment8;

public class CompanyObject {
    public static void main(String[] args) {

        Company company = new Company();
        company.setCompanyID(001);
        company.setDescription("IT");
        company.setName("Apple");

        System.out.println("company.getCompanyID() = " + company.getCompanyID());
        System.out.println("company.getDescription() = " + company.getDescription());
        System.out.println("company.getName() = " + company.getName());

        Company company2 = new Company();
        company2.setCompanyID(002);
        company2.setDescription("IT");
        company2.setName("Cyedeo");

        System.out.println("company2.getCompanyID() = " + company2.getCompanyID());
        System.out.println("company2.getDescription() = " + company2.getDescription());
        System.out.println("company2.getName() = " + company2.getName());

    }
}
