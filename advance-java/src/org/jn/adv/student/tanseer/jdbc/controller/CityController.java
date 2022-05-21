package org.jn.adv.student.tanseer.jdbc.controller;

import org.jn.adv.student.tanseer.jdbc.model.City;
import org.jn.adv.student.tanseer.jdbc.service.CityService;

public class CityController 
{
	static CityService cityService = new CityService();
	
	public static void main(String[] args) 
	{
//		create();
//		update();
//		deleteById();
		findAll();
	}
	
	static void create() {
		City city = new City();
		city.setId(1);
		city.setCity("Hyderabad");
		cityService.create(city);
		
		city.setId(2);
		city.setCity("Delhi");
		cityService.create(city);
		
		city.setId(3);
		city.setCity("Kolkata");	
		cityService.create(city);
		
		cityService.connectionClose();
	}
	
	static void deleteById() {
		cityService.deleteById(1);
		
	}
	
	static void findAll(){
		System.out.println(cityService.getAll());
	}
	
	static void update() {
		City city = new City();
		city.setId(3);
		city.setCity("Pune");
		
		cityService.update(city);
		cityService.connectionClose();
	}
}
