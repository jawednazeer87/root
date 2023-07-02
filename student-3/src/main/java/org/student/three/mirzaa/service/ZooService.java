package org.student.three.mirzaa.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Zoo;
import org.student.three.mirza.repository.ZooRepository;
@Service
public class ZooService {
	
	@Autowired
	private ZooRepository zooRepository;
	
	public List<Zoo> getAll() {
		return zooRepository.findAll();
	}
	
	public Zoo create(Zoo zoo) {
		return zooRepository.save(zoo);
	}
	
	public List<Zoo> findByName(String name) {
		return zooRepository.findByName(name);
	}
	
	public Zoo findByEmailZooAuthority (String emailZooAuthority) {
		return zooRepository.findByEmailZooAuthority (emailZooAuthority);
	}
	
	public Zoo updateByEmailZooAuthority(String emailZooAuthority, String name) {
		Zoo zoo = zooRepository.findByEmailZooAuthority(emailZooAuthority);
		if (zoo != null) {
			zoo.setName(name);
			zoo = zooRepository.save(zoo);
		}
		return zoo;
	}
	
	public void deleteById(long id) {
		Zoo zoo = zooRepository.getReferenceById(id);
		if (zoo != null) {
			zooRepository.delete(zoo);
		}
	}


}

