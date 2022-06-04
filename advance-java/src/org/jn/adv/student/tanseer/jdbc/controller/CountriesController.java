package org.jn.adv.student.tanseer.jdbc.controller;

import org.jn.adv.student.tanseer.jdbc.model.Countries;
import org.jn.adv.student.tanseer.jdbc.service.CountriesService;

public class CountriesController 
{
	static CountriesService countriesService = new CountriesService();
	public static void main(String[] args) 
	{
//		create();
//		update();
//		deleteById();
		findAll();
	}
	
	static void create() {
		Countries countries = new Countries();
		countries.setCode(1);
		countries.setName("India");
		countries.setContinentName("Asia");
		countriesService.create(countries);
		
		countries.setCode(2);
		countries.setName("South Africa");
		countries.setContinentName("Africa");
		countriesService.create(countries);
		
		countries.setCode(3);
		countries.setName("England");
		countries.setContinentName("Europe");
		countriesService.create(countries);
		
		countriesService.connectionClose();
	}
	
	static void deleteById() {
		countriesService.deleteById(2);
		
	}
	
	static void findAll(){
		System.out.println(countriesService.getAll());
	}
	
	static void update() {
		Countries countries = new Countries();
		countries.setCode(3);
		countries.setName("London");
		
		countriesService.update(countries);
		countriesService.connectionClose();
	}
}
