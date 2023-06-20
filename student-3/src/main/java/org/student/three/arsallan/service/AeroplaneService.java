package org.student.three.arsallan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.arsallan.repository.AeroplaneRepository;
import org.student.three.arsallan.model.Aeroplane;

//@RestController
//@RequestMapping("/aeroplane")
@Service
public class AeroplaneService {

	@Autowired
	private AeroplaneRepository aeroplaneRepository;
	
	public List<Aeroplane> getAll(){
		return aeroplaneRepository.findAll();
	}
	
	public List<Aeroplane> findByModel(String model){
		return aeroplaneRepository.findByModel(model);
	}
	
	public void deleteById(long id) {
		Aeroplane aeroplane = aeroplaneRepository.getReferenceById(id);
		if(aeroplane != null) {
			aeroplaneRepository.delete(aeroplane);
		}
	}
}
