package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Brands;
import org.jn.core.java.student.shoaeeb.jdbc.service.BrandsService;

public class BrandController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrandController controller = new BrandController();
		controller.getAllBrands();
	}
	
	public void getAllBrands() {
		BrandsService service = new BrandsService();
		List<Brands> list = service.getAllBrands();
		print(list);
	}
	
	public void print(List<Brands> list)
	{
		for(Brands brand:list)
		{
			System.out.println(brand);
		}
	}

}
