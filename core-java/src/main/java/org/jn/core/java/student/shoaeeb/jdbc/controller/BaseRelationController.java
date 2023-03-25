package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.BaseRelationDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.BaseRelation;
import org.jn.core.java.student.shoaeeb.jdbc.service.BaseRelationService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseRelationController {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseRelationController controller = new BaseRelationController();
		//controller.getAllRelation();
		//controller.findBaseRelationById();
		controller.updateTable();
	}
	
	public void getAllRelation() {
		BaseRelationService service = new BaseRelationService();
		List<BaseRelation> list = service.getAllRelation();
		print(list);
	}
	public void findBaseRelationById() {
		int id=1;
		BaseRelationService service = new BaseRelationService();
		BaseRelation bs = service.findBaseRelationById(id);
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(bs);
		BaseRelationDto  baseRelationDto = gson.fromJson(json, BaseRelationDto.class);
		print(baseRelationDto);
		
	}
	
	public void updateTable() {
		BaseRelationService service = new BaseRelationService();
		BaseRelationDto bsDto = new BaseRelationDto();
		bsDto.setId(1);
		bsDto.setBrandsId(2);
		bsDto.setCategoryId(3);
		bsDto.setCollectionId(4);
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(bsDto);
		BaseRelation bs = gson.fromJson(json, BaseRelation.class);
		int count=service.updateTable(bs);
		if(count>0)
		{
			System.out.println(count+" rows are updated");
		}
		else {
			System.out.println("No rows are updated");
		}
		
	}
	
	public static void print(List<BaseRelation> list)
	{
		for(BaseRelation bs:list)
		{
			System.out.println(bs);
		}

	}
	
	public static void print(BaseRelationDto baseRelationDto)
	{
		System.out.println((baseRelationDto));
	}
	
	

}
