package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.City;
import org.student.three.mirza.repository.CityRepository;

@Service
public class CityService {

	
	@Autowired
	
	private CityRepository cityRepository ;
	
	public List<City> getAll(){
		
		return cityRepository.findAll();
		
	}
	public City create (City city ) {
		return cityRepository.save(city);
		
	}
	public City findById (int id) {
		return cityRepository.findById(id);
	}
	public City updateById (int id ,String city) {
		City city1 = cityRepository.findById(id);
			if (city1!=null) {
				city1.setCity(city);
				city1 = cityRepository.save(city1);
			}
			return city1;
	}
	public void deleteById (long id ) {
		City city =cityRepository.getReferenceById(id);
		if (city!=null) {
			cityRepository.delete(city);
		}
	}
	public List<City >findByCity(String city){
		return cityRepository.findByCity(city);
	}
}
