package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.AeroplaneRouteInternationalDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.AeroplaneRouteInternational;
import org.jn.core.java.student.shoaeeb.jdbc.service.AeroplaneRouteInternationalService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AeroplaneRouteInternationalController {
	public static void main(String args[])
	{
		AeroplaneRouteInternationalController controller = new AeroplaneRouteInternationalController();
		//controller.getALlAeroplane();
		controller.findAeroplaneRoute();
	}
	
	public void getALlAeroplane()
	{
		AeroplaneRouteInternationalService service = new AeroplaneRouteInternationalService();
		List<AeroplaneRouteInternational> list = service.getALlAeroplane();
		print(list);
	}
	
	public void print(List<AeroplaneRouteInternational> list)
	{
		for(AeroplaneRouteInternational aeroplane:list)
		{
			System.out.println(list);
		}
	}
	public void print(AeroplaneRouteInternationalDto aeroplane)
	{
		System.out.println(aeroplane);
	}
	public void findAeroplaneRoute() {
		int id=1;
		AeroplaneRouteInternationalService service = new AeroplaneRouteInternationalService();
		AeroplaneRouteInternational aeroplane = service.findAeroplaneRoute(id);
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(aeroplane);
		AeroplaneRouteInternationalDto aeroplaneDto = gson.fromJson(json, AeroplaneRouteInternationalDto.class);
		print(aeroplaneDto);
	}
}
