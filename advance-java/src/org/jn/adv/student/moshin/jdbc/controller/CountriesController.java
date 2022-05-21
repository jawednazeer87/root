package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.dto.CountriesDTO;
import org.jn.adv.student.moshin.jdbc.dto.EmployeeDTO;
import org.jn.adv.student.moshin.jdbc.model.Countries;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.service.CountriesService;
import org.jn.adv.student.moshin.jdbc.service.EmployeeService;
import org.jn.adv.student.moshin.jdbc.util.GSONGenericUtil;

public class CountriesController {
		static CountriesService countriesService = new CountriesService();
		public static void main(String[] args) {
			create();
//			CountriesDTO dto = GSONGenericUtil.map(getAll().get(5), CountriesDTO.class);
//			System.out.println(dto);
//			getAll().stream().forEach(System.out::println);
//			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			Countries countries = new Countries();
			countries.setCode(12221);
			countries.setName("india");
			countries.setContinent_name("aisa");
			countriesService.create(countries);
			countriesService.connectionClose();
		}
		
		static List<CountriesDTO> getAll() {
			List<Countries> countriesList = countriesService.getAll();
			countriesService.connectionClose();
			final List<CountriesDTO> dtoList = new ArrayList<>();
			countriesList.stream().forEach(countries-> {
				CountriesDTO dto = GSONGenericUtil.map(countries, CountriesDTO.class);
				dtoList.add(dto);
			});
			return dtoList;
		}
		
		static List<CountriesDTO> getByDobRange() {
			List<Countries> countriesList = countriesService.getByDobRange(LocalDate.of(1979, 01, 10), 
																		LocalDate.of(2021, 01, 10));
			countriesService.connectionClose();
			List<CountriesDTO> dtoList = GSONGenericUtil.mapList(countriesList, CountriesDTO.class);
			return dtoList;
		}

}
