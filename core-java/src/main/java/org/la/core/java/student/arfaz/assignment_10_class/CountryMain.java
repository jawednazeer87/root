package org.la.core.java.student.arfaz.assignment_10_class;

public class CountryMain {

	public static void main(String[] args) {
		Countries comp = new Countries();
//		code, name, continentName

		comp.setCode(5);
		comp.setName("Arfaz");
		comp.setContinentName("India,Asia");
		System.out.println(comp.getCode());
		System.out.println(comp.getName());
		System.out.println(comp.getContinentName());
	}

}
