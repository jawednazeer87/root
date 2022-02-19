package org.la.core.java.student.tanseer.assignment8.classes;

public class CountriesMain 
{
	public static void main(String[] args) 
	{
		Countries countries = new Countries();
		countries.setCode(1010);
		countries.setContinentName("Asia");
		countries.setName("India");
		
		int code = countries.getCode();
		String cName = countries.getContinentName();
		String name = countries.getName();
		
		System.out.println("Code  "+code);
		System.out.println("Continent Name "+cName);
		System.out.println("Country Name "+name);
	}
}
