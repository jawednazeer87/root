package org.student.three.arsallan.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.arsallan.repository.AeroplaneRepository;
import org.student.three.arsallan.model.Aeroplane;

@Service
public class AeroplaneService {

	@Autowired
	private AeroplaneRepository aeroplaneRepository;
	
	//create
	public Aeroplane create(Aeroplane aeroplane) {
		return aeroplaneRepository.save(aeroplane);
	}
	
	//read
	public List<Aeroplane> getAll(){
		return aeroplaneRepository.findAll();
	}
	
	//read
	public List<Aeroplane> findByModel(String model){
		return aeroplaneRepository.findByModel(model);
	}
	
	//update
	public List<Aeroplane> updateSpeed(String model,int speed){
		List<Aeroplane> aeroplane = aeroplaneRepository.findByModel(model);
		for (Iterator<Aeroplane> iterator = aeroplane.iterator(); iterator.hasNext();) {
			Aeroplane aeroplane2 = (Aeroplane) iterator.next();
			aeroplane2.setSpeed(speed);
			aeroplane2 = aeroplaneRepository.save(aeroplane2);
		}
		return aeroplane;
	}
	
	//delete
	public void deleteById(long id) {
		Aeroplane aeroplane = aeroplaneRepository.getReferenceById(id);
		if(aeroplane != null) {
			aeroplaneRepository.delete(aeroplane);
		}
	}
	
	
}
