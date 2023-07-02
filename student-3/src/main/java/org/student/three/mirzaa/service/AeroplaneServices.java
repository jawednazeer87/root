package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Aeroplanes;
import org.student.three.mirza.repository.AeroplanesRepository;



@Service
public class AeroplaneServices {

	
	@Autowired
	public AeroplanesRepository   aeroplanesRepository;
	
	// read
	public List <Aeroplanes> getAll(){
		return aeroplanesRepository.findAll();	//get mapping will use for get the data from database.
	}
	//create
	public Aeroplanes create(Aeroplanes aeroplanes) {  // post mapping will use to create data into database.
	return aeroplanesRepository.save(aeroplanes);
	}
	
	
	//read
	public List<Aeroplanes> findByName (String name ) {
	return aeroplanesRepository.findByName(name);
		
	}
	public Aeroplanes findByModel(String model) {
	return ((AeroplaneServices) aeroplanesRepository).findByModel(model);
	}
	//delete
	public void delateById (long id) {
    Aeroplanes aeroplanes= aeroplanesRepository.getReferenceById(id);
	if (aeroplanes !=null) {
	 aeroplanesRepository.deleteById(id);
	     
	}
	     
	}
// update
	public Aeroplanes updateByName(String name, String modelName) {
		// TODO Auto-generated method stub
		return ((AeroplaneServices) aeroplanesRepository).updateByName(name,   modelName);
	}


	}


	

	
	
	
	


