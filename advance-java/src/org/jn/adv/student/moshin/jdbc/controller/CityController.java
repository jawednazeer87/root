package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.dto.CityDTO;
import org.jn.adv.student.moshin.jdbc.dto.EmployeeDTO;
import org.jn.adv.student.moshin.jdbc.model.City;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.service.CityService;
import org.jn.adv.student.moshin.jdbc.service.EmployeeService;
import org.jn.adv.student.moshin.jdbc.util.GSONGenericUtil;

public class CityController {
		static CityService cityService = new CityService();
		public static void main(String[] args) {
			create();
//			EmployeeDTO dto = GSONGenericUtil.map(getAll().get(5), EmployeeDTO.class);
//			System.out.println(dto);
//			getAll().stream().forEach(System.out::println);
//			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			City city = new City();
			city.setId(1);
			city.setCity("Mumbai");
			cityService.create(city);
			cityService.connectionClose();
		}
		
		static List<CityDTO> getAll() {
			List<City> cityList = cityService.getAll();
			cityService.connectionClose();
			final List<CityDTO> dtoList = new ArrayList<>();
			cityList.stream().forEach(city-> {
				CityDTO dto = GSONGenericUtil.map(city, CityDTO.class);
				dtoList.add(dto);
			});
			return dtoList;
		}
		
		static List<CityDTO> getByDobRange() {
			List<City> cityList = cityService.getByDobRange(LocalDate.of(1979, 01, 10), 
																		LocalDate.of(2021, 01, 10));
			cityService.connectionClose();
			List<CityDTO> dtoList = GSONGenericUtil.mapList(cityList, CityDTO.class);
			return dtoList;
		}

}
