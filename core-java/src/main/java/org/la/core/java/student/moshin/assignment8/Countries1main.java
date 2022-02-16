package org.la.core.java.student.moshin.assignment8;

public class Countries1main {
	
	public static void main(String[] args) {
		Countries1 countries = new Countries1();
        countries.setCode(1);
        countries.setContinentName("Asia");
        countries.setName("India");

        System.out.println("countries.getCode() = " + countries.getCode());
        System.out.println("countries.getContinentName() = " + countries.getContinentName());
        System.out.println("countries.getName() = " + countries.getName());
	}
}
