package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.AeroplaneDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.Aeroplane;
import org.jn.core.java.student.shoaeeb.jdbc.service.AeroplaneService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AeroplaneController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AeroplaneController ac = new AeroplaneController();
		//ac.getAeroplaneByName();
		//ac.updateAeroplane();
		ac.findAeroplaneById();
	
		
	}
	
	public void getAeroplaneByName() {
		String name = "Boeing";
		AeroplaneService service =new  AeroplaneService();
		List<Aeroplane> aeroplaneList = new ArrayList<>();
		aeroplaneList=service.getAeroplaneByName(name);
		print(aeroplaneList);
	}
	public void updateAeroplane() {
		AeroplaneDto aeroplaneDto = new AeroplaneDto();
		aeroplaneDto.setId(1);
		aeroplaneDto.setName("SkyJet");
		aeroplaneDto.setCapacity(100);
		aeroplaneDto.setCompanyName("Etihad");
		aeroplaneDto.setModelName("755");
		LocalDate localDate = LocalDate.now();
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		aeroplaneDto.setUpdatedDate(date);
		Gson gson  = new Gson();
		String json = gson.toJson(aeroplaneDto);
		Aeroplane aeroplane = gson.fromJson(json, Aeroplane.class);
		AeroplaneService service =new  AeroplaneService();
		service.updateAeroplane(aeroplane);
		json = gson.toJson(aeroplane);
		aeroplaneDto = gson.fromJson(json, AeroplaneDto.class);
		print(aeroplaneDto);
		
	}
	
	public void findAeroplaneById()
	{
		int id = 1;
		AeroplaneService service =new  AeroplaneService();
		Aeroplane aeroplane =  new Aeroplane();
		aeroplane = service.findAeroplaneById(id);
		Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy").create();

		String json = gson.toJson(aeroplane);
		AeroplaneDto aeroplaneDto = gson.fromJson(json, AeroplaneDto.class);
		print(aeroplaneDto);
		
	}
	
	public void print(List<Aeroplane> aeroplaneList)
	{
		for(Aeroplane aeroplane: aeroplaneList)
		{
			System.out.println(aeroplane);
		}
	}
	public void print(AeroplaneDto aeroplaneDto)
	{
		System.out.println(aeroplaneDto);
	}
	
	
	

}
