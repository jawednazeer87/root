package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Car;
import org.jn.core.java.student.shoaeeb.jdbc.repository.CarRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class CarService {
	public static Connection con=null;
	public CarService() {
		con = GetSqlConnection.getConnection();
	}
	
	public List<Car> getAllCar() {
		List<Car> list = new ArrayList<>();
		list = CarRepository.getAllCar(con);
		return list;
	}
	
	public int deleteCarById(int id)
	{
		int count=CarRepository.deleteCarById(con, id);
		return count;
	}
	
}
