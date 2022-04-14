package org.jn.adv.student.tanseer.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.dto.ProductsDTO;
import org.jn.adv.student.tanseer.jdbc.model.Products;
import org.jn.adv.student.tanseer.jdbc.service.ProductsService;
import org.jn.adv.student.tanseer.jdbc.util.GSONGenericUtil;

public class ProductsController 
{
	static ProductsService productsservice = new ProductsService();
	
	public static void main(String[] args) 
	{
//		create();
		getAll().stream().forEach(System.out::println);
	}
	
	static void create()
	{
		Products products = new Products();
		products.setMerchantId(1023);
		products.setName("Maz");
		products.setPrice(6000);
		products.setStatus(false);
		products.setCreatedAt("UAE");
		
		productsservice.create(products);
		productsservice.connectionClose();
	}
	
	static List<ProductsDTO> getAll(){
		
		List<Products> productsList = productsservice.getAll();
		productsservice.connectionClose();
		
		final List<ProductsDTO> dtoList = new ArrayList<>();
		productsList.stream().forEach(products-> {
			ProductsDTO dto = GSONGenericUtil.map(products, ProductsDTO.class);
			dtoList.add(dto);
		});
		return dtoList;
	}
}
