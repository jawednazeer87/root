package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.dto.BrandsDTO;
import org.jn.adv.student.moshin.jdbc.dto.CountriesDTO;
import org.jn.adv.student.moshin.jdbc.dto.EmployeeDTO;
import org.jn.adv.student.moshin.jdbc.model.Brands;
import org.jn.adv.student.moshin.jdbc.model.Countries;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.service.BrandsService;
import org.jn.adv.student.moshin.jdbc.service.CountriesService;
import org.jn.adv.student.moshin.jdbc.service.EmployeeService;
import org.jn.adv.student.moshin.jdbc.util.GSONGenericUtil;

public class BrandsController {
		static BrandsService brandsService = new BrandsService();
		public static void main(String[] args) {
			create();
//			BrandsDTO dto = GSONGenericUtil.map(getAll().get(5), BrandsDTO.class);
//			System.out.println(dto);
//			getAll().stream().forEach(System.out::println);
//			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			Brands brands = new Brands();
			brands.setId(12221);
			brands.setBrand_name("india");
			brands.setThumbnails("aisa");
			brandsService.create(brands);
			brandsService.connectionClose();
		}
		
		static List<BrandsDTO> getAll() {
			List<Brands> brandsList = brandsService.getAll();
			brandsService.connectionClose();
			final List<BrandsDTO> dtoList = new ArrayList<>();
			brandsList.stream().forEach(brands-> {
				BrandsDTO dto = GSONGenericUtil.map(brands, BrandsDTO.class);
				dtoList.add(dto);
			});
			return dtoList;
		}
		
		static List<BrandsDTO> getByDobRange() {
			List<Brands> brandsList = brandsService.getByDobRange(LocalDate.of(1979, 01, 10), 
																		LocalDate.of(2021, 01, 10));
			brandsService.connectionClose();
			List<BrandsDTO> dtoList = GSONGenericUtil.mapList(brandsList, BrandsDTO.class);
			return dtoList;
		}

}
