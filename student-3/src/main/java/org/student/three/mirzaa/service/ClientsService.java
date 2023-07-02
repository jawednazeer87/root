package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Client;

import org.student.three.mirza.repository.MirzaClientRepository;

@Service
public class ClientsService {
	

	
	
	@Autowired
	
	private MirzaClientRepository mirzaClientRepository ;
	
	public List <Client> getAll(){
		return mirzaClientRepository.findAll();
		
	}
	
	public Client create (Client client) {
		return mirzaClientRepository.save(client);
	}
	
	public Client findByEmail (String email) {
		return mirzaClientRepository.findByEmail(email);
	}
	
	public Client updateByEmail (String email , String name) {
		Client client = mirzaClientRepository.findByEmail(email);
		if (client !=null) {
			client.setName(name);
			client = mirzaClientRepository.save(client);
		}
		return client;
	}
	
	public void deleteByCountry (String country) {
		Client client =mirzaClientRepository.getReferenceByName(country);
		if (client != null) {
			mirzaClientRepository.delete(client);
		}
	}
		
		public List<Client> findByName(String name){
			return mirzaClientRepository.findByName(name);
		
		
	}
}
 