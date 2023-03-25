package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

import org.jn.core.java.student.shoaeeb.jdbc.dto.BirdDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.Bird;
import org.jn.core.java.student.shoaeeb.jdbc.service.BirdService;

import com.google.gson.Gson;

public class BirdController {
	public static void main(String args[])
	{
		BirdController controller = new BirdController();
		//controller.getAllBird();
		controller.updateBirdById();
	}
	
	public void getAllBird() {
		BirdService service = new BirdService();
		List<Bird> list = service.getAllBird();
		print(list);
	}
	public void print(List<Bird> list)
	{
		for(Bird bird: list)
		{
			System.out.println(bird);
		}
	}
	
	public void updateBirdById() 
	{
		BirdService service = new BirdService();
		BirdDto birdDto = new BirdDto();
		birdDto.setId(1);
		birdDto.setBirdName("name");
		String sDate = "2023-03-18";
		Date date1 = new Date();
		try {
			 date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		birdDto.setDob(date1);
		birdDto.setCanFly(false);
		birdDto.setWeight(0.5f);
		birdDto.setHeight(50.0f);
		birdDto.setCanSwim(false);
		Gson gson = new Gson();
		String json = gson.toJson(birdDto);
		Bird bird = gson.fromJson(json, Bird.class);
		int count = service.updateBirdById(bird);
		if(count>0)
		{
			System.out.println(count+"rows are updated");
		}
		else {
			System.out.println("No rows updated");
		}
	}
}
