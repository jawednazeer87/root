package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Car;
import org.jn.core.java.student.shoaeeb.jdbc.service.CarService;

public class CarController {
	public static void main(String args[])
	{
		CarController Cc = new CarController();
		Cc.getAllCar();
	}
	
	public void getAllCar() {
		List<Car> list = new ArrayList<>();
		CarService carService = new CarService();
		list = carService.getAllCar();
		for(Car car:list)
		{
			System.out.println(car);
		}
		
	}
}
	