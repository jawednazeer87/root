package org.student.three.mirzaa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Manager;
import org.student.three.mirza.repository.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	
	private  ManagerRepository managerRepository;
	
	public List <Manager> getAll (){
		
		return managerRepository.findAll();
	}
   
	public Manager create (Manager manager) {
		return managerRepository.save(manager);
		
	}
	
	public Manager findByEmil (String email) {
		
		return managerRepository.findByEmail(email);
	}
	
	public Manager updateByEmail (String email, Date dob) {
		 Manager manager =managerRepository.findByEmail(email);
		 
		 if (manager !=null) {
			 manager.setDob(dob);
			 manager = managerRepository.save(manager);
		 }
		return manager;
	}
	
	public void deleteById (long id) {
		Manager manager =managerRepository.getReferenceById( id);
		if(manager !=null) {
			managerRepository.delete(manager);
		}
		
	}
	
	public List <Manager > findByName(String name) {
		
		return managerRepository.findByName(name);
		
	}
}
