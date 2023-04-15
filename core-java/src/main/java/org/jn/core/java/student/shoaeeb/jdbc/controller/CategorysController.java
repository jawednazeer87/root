package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.dto.CategorysDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.Categorys;
import org.jn.core.java.student.shoaeeb.jdbc.service.CategoryService;

import com.google.gson.Gson;

public class CategorysController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategorysController categoryController = new CategorysController();
		//categoryController.getAllCategorys();
		categoryController.createCategory();
	}
	
	public void getAllCategorys() {
		List<Categorys> list = new ArrayList<>();
		CategoryService cS = new CategoryService();
		list=cS.getAllCategorys();
		for(Categorys category:list)
		{
			System.out.println(category);
		}
		
		
	}
	
	public void createCategory() {
		CategorysDto categorysDto = new CategorysDto();
		categorysDto.setId(5);
		categorysDto.setCategoryName("category name2");
		categorysDto.setThumbnails("thumbnails2");
		Gson gson=new Gson();
		String json = gson.toJson(categorysDto);
		Categorys categorys = gson.fromJson(json, Categorys.class);
		CategoryService service = new CategoryService();
		int count=service.createCategory(categorys);	
		System.out.println(count+" rows are updated");
	}
	

}
