package org.la.core.java.student.majeed.assignment8;

/*
15.	Create a class Countries having member variables code, name, continentName. create getters and 
	setters for all member variables. Create object of Countries class in other class inside main 
	method and set all member values and print all member values using getters.
 */

public class CountriesMain {
    public static void main(String[] args) {
        Countries countries = new Countries();
        countries.setCode(101);
        countries.setContinentName("Asia");
        countries.setName("India");

        System.out.println("Code = " + countries.getCode());
        System.out.println("Continent Name = " + countries.getContinentName());
        System.out.println("Country Name = " + countries.getName());
        
    }	
		
}
