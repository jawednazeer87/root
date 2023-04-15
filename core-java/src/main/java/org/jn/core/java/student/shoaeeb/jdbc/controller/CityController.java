package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.CityDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.City;
import org.jn.core.java.student.shoaeeb.jdbc.service.CityService;

public class CityController {
	public static void main(String args[])
	{
		CityController cityController = new CityController();
		cityController.getAllCity();
	}
	public void getAllCity() {
		CityService service = new CityService();
		List<City> list = new ArrayList<>();
		list=service.getAllCity();
		System.out.println(list);
		
	}
	public void print(CityDto cityDto)
	{
		System.out.println(cityDto);
	}
}
