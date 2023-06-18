package org.jn.core.java.student.mirza.jdbc.service;

	
	import java.util.List;

	import org.jn.core.java.student.mirza.jdbc.dto.CountriesDto;
import org.jn.core.java.student.mirza.jdbc.model.Countries;
	import org.jn.core.java.student.mirza.jdbc.repository.CountriesRepository;

	public class CountriesService {

	

		

		
			static CountriesRepository countriesRepository = new CountriesRepository();

			public void create(CountriesDto countriesDto) {
				countriesRepository.create(countriesDto);
			}

			public void update(CountriesDto countriesDto) {
				countriesRepository.update( countriesDto);
			}

			public void delete(int code) {
				countriesRepository.delete(code);
			}

			public static CountriesDto readByName(String Name) {
				return countriesRepository.findByName(Name);
			}

			public static List<CountriesDto> readAll() {
				return countriesRepository.readAll();
			}

			public static List<CountriesDto> readByCountinentName(String CountinentName) {
				return countriesRepository.findByCountinentName(CountinentName);
			}

			public static List<CountriesDto> readByCode(int Code) {
				// TODO Auto-generated method stub
				return countriesRepository.findByCode(Code);
			}
		}




