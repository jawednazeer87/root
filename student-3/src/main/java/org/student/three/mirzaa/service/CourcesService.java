  package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Cources;
import org.student.three.mirza.repository.CourcesRepository;

@Service
public class CourcesService {
	
	@Autowired
	private CourcesRepository courcesRepository ;
	
	public List <Cources> getAll (){
		
		return courcesRepository.findAll();
	}
	public Cources create(Cources cources) {
		return courcesRepository.save(cources);
	}

	public Cources findByInstituteName (String instituteName) {
		return courcesRepository.findByInstituteName (instituteName);
		
		}
	public Cources updateByInstituteName (String instituteName , String name) {
		Cources cources =courcesRepository.findByInstituteName(instituteName);
		if (cources!=null) {
			cources.setInstituteName(instituteName);
			courcesRepository.save(cources);
		}
		return cources;
	}
     public void  deleteById (long id) {
    	 Cources cources = courcesRepository.getReferenceById(id);
    	    if (cources!=null) {
    	    	courcesRepository.delete(cources);
    	    }
    	 
     }
     public List<Cources> findByName (String name){
    	 return courcesRepository.findByName(name);
     }
}
