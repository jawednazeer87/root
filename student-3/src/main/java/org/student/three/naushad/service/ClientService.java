package org.student.three.naushad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.naushad.model.Client;
import org.student.three.naushad.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Client create(Client client) {
		return clientRepository.save(client);
	}

	public Client getById(long id) {
		Optional<Client> client = clientRepository.findById(id);
		if (client.isPresent()) {
			return client.get();
		} else
			return null;

	}

	public Client getByEmail(String email) {
		return clientRepository.getByEmail(email);
	}

	public List<Client> getAll() {
		return clientRepository.findAll();
	}

	public Client updateNameById(String name, long id) {
		Client client = getById(id);
		if (client != null) {
			client.setName(name);
			return clientRepository.save(client);
		}
		return client;
	}

	public Client updateEmailById(String email, long id) {
		Client client = getById(id);
		if (client != null) {
			client.setEmail(email);
			return clientRepository.save(client);
		}
		return client;
	}

	public void deleteById(long id) {
		Client client = clientRepository.getReferenceById(id);
		if (client != null) {
			clientRepository.delete(client);
		}
	}

}
