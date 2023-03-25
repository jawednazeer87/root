package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.AeroplaneRouteDomesticDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.AeroplaneRouteDomestic;
import org.jn.core.java.student.shoaeeb.jdbc.service.AeroplaneRouteService;

import com.google.gson.Gson;

public class AeroplaneRouteController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AeroplaneRouteController ac = new AeroplaneRouteController();
		//ac.getAllAeroplaneRoutes();
		ac.updateAeroplane();
		
	}
	
	public void getAllAeroplaneRoutes() {
		AeroplaneRouteService service = new AeroplaneRouteService();
		List<AeroplaneRouteDomestic> list = service.getAllAeroplaneRoutes();
		print(list);
	}
	
	public void updateAeroplane() {
		AeroplaneRouteService service = new AeroplaneRouteService();
		AeroplaneRouteDomestic aeroplane = new AeroplaneRouteDomestic();
		aeroplane.setId(1);
		aeroplane.setRouteName("bna");
		java.util.Date date = new java.util.Date(2022-03-13);
		aeroplane.setDepartureDate(date);
		date = new java.util.Date(2022-03-14);
		aeroplane.setArrivalDate(date);
		aeroplane.setDepartureCity("hjda");
		aeroplane.setDepartureState("plda");
		aeroplane.setArrivalCity("papd");
		aeroplane.setArrivalState("uiip");
		aeroplane.setCountry("india");
		int count = service.updateAeroplaneRoute(aeroplane);
		if(count>0)
		{
			System.out.println(count + "rows updated");
		}
		else {
			System.out.println("no rows updated");
		}
		Gson gson = new Gson();
		String json = gson.toJson(aeroplane);
		AeroplaneRouteDomesticDto aeroplaneDto = gson.fromJson(json, AeroplaneRouteDomesticDto.class);
		print(aeroplaneDto);
		
	}
	
	
	
	public void print(List<AeroplaneRouteDomestic> list)
	{
		for(AeroplaneRouteDomestic aeroplane: list)
		{
			System.out.println(aeroplane);
		}
	}
	public void print(AeroplaneRouteDomesticDto aeroplaneDto)
	{
		System.out.println(aeroplaneDto);
	}

}
