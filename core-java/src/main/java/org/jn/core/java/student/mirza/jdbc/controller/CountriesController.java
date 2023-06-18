package org.jn.core.java.student.mirza.jdbc.controller;


	import java.util.List;

	import org.jn.core.java.student.mirza.jdbc.model.Countries;
	import org.jn.core.java.student.mirza.jdbc.dto.CountriesDto;
	import org.jn.core.java.student.mirza.jdbc.service.CountriesService;

	import org.jn.core.java.mirza.jdbc.util.CountriesUtil;

	public class CountriesController {

		
	CountriesService countriesService = new CountriesService();

			public static void main(String[] args) {
				CountriesController countriesController = new CountriesController();
				countriesController.create();
//				clientController.update();
//				clientController.delete();
//				 clientController.readById();
//				clientController.readAll();
//				clientController.readByCompany_name();
			}

			public void create() {
				Countries countries = new Countries();
				countries.setCode(92);
				countries.setName("India");
				countries.setCountinentName("Asia");
				

				CountriesDto countriesDto = CountriesUtil.toDtoAuto(countries);
				countriesService.create(countriesDto);

			}

			public void update() {
				Countries countries = new Countries();
				countries.setCode(93);
				countries.setName("palestine");
				countries.setCountinentName("ArabWorld");
				
				CountriesDto countriesDto = CountriesUtil.toDtoAuto(countries);
				countriesService.update(countriesDto);
			}

			public void delete() {
				int Code = 92;
				countriesService.delete(Code);
			}

			public void readByCode() {
				int code = 92;
				List<CountriesDto> countriesDto = countriesService.readByCode(code);
				System.out.println(countriesDto);
			}

			public void readByName() {
				String Name = "india";
				CountriesDto countriesDto = countriesService.readByName(Name);
				System.out.println(countriesDto);
			}

			public void readAll() {
				List<CountriesDto> countriesDto = countriesService.readAll();
				System.out.println(countriesDto);

			}

		

	}

