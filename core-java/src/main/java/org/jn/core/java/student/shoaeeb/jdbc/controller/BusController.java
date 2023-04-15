package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.BusDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.Bus;
import org.jn.core.java.student.shoaeeb.jdbc.service.BusService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class BusController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusController bController = new BusController();
		//bController.getAllBus();
		bController.findBusById();
	}
	
	public void getAllBus()
	{
		BusService busService = new BusService();
		List<Bus> list = new ArrayList<>();
		list=busService.getAllBus();
		for(Bus bus:list)
		{
			System.out.println(bus);
		}
		
		
	}
	
	public void findBusById() {
		BusService bService = new BusService();
		Bus b = new Bus();
		b=bService.findBusById(1);
 		Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy").create();
		String json = gson.toJson(b);
		BusDto busDto = gson.fromJson(json, BusDto.class);
		print(busDto);
	}
	
	public void print(BusDto busDto) {
		System.out.println(busDto);
	}

}
