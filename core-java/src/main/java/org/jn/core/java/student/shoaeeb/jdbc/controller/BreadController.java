package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.BreadDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.Bread;
import org.jn.core.java.student.shoaeeb.jdbc.service.BreadService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BreadController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreadController bc = new BreadController();
		//bc.getAllBread();
		//bc.findBreadById();
		//bc.createBread();
		bc.updateBreadById();
		
	}
	
	public void getAllBread() { 
		List<Bread> list = new ArrayList<>();
		BreadService service = new BreadService();
		list=service.getAllBread();
		for(Bread bread:list)
		{
			System.out.println(bread);
		}
		
	}
	
	public void findBreadById() {
		int id=1;
		BreadService service = new BreadService();
		Bread bread = service.findBreadById(id);
		Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy").create();
		String json = gson.toJson(bread);
		BreadDto breadDto = gson.fromJson(json, BreadDto.class);
		print(breadDto);
	}
	
	public void createBread() {
		BreadDto breadDto = new BreadDto();
		breadDto.setName("Bread2");
		Date date = new Date();
		breadDto.setCreatDate(date);
		breadDto.setExpDate(date);
		breadDto.setType("edible");
		breadDto.setEmailOrg("bread1@gmail.com");
		Gson gson = new Gson();
		String json = gson.toJson(breadDto);
		Bread bread=gson.fromJson(json, Bread.class);
		BreadService service = new BreadService();
		int count = service.createBread(bread);
		System.out.println(count+"rows are updated");
	}
	
	
	public void updateBreadById() {
		BreadDto breadDto = new BreadDto();
		breadDto.setId(3);
		breadDto.setName("Bread3");
		Date date = new Date();
		breadDto.setCreatDate(date);
		breadDto.setExpDate(date);
		breadDto.setType("Edible");
		breadDto.setEmailOrg("Bread3@gmail.com");
		BreadService service = new BreadService();
		Gson gson = new Gson();
		String json  = gson.toJson(breadDto);
		Bread bread = gson.fromJson(json,Bread.class );
		
		int count=service.updateBreadById(bread);
		System.out.println(count+" rows are updated");
	}
	
	
	//print method
	public void print(BreadDto breadDto)
	{
		System.out.println(breadDto);
	}

}
