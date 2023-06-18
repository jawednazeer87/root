package org.jn.core.java.student.mirza.jdbc.service;


import java.util.List;

import org.jn.core.java.student.mirza.jdbc.dto.ClientDto;
//import org.jn.core.java.student.mirza.jdbc.model.Client;
import org.jn.core.java.student.mirza.jdbc.repository.ClientRepository;


public class ClientService {

	

	
		static ClientRepository clientRepository = new ClientRepository();

		public void create(ClientDto clientDto) {
			clientRepository.create(clientDto);
		}

		public void update(ClientDto clientDto) {
			clientRepository.update(clientDto);
		}

		public void delete(int zip) {
			clientRepository.delete(zip);
		}

		public ClientDto readByName1(String Name) {
			return clientRepository.findByName(Name);
		}

		public List<ClientDto> readAll() {
			return clientRepository.readAll();
		}

		public List<ClientDto> readByName(String Name) {
			return clientRepository.findByCountry(Name);
		}

		public static ClientDto readByZip(int Zip) {
			// TODO Auto-generated method stub
			return clientRepository.findByZip(Zip);
		}
	}


