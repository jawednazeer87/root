package org.student.three.naushad.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.student.three.naushad.model.Client;
import org.student.three.naushad.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientRestController {

	@Autowired
	private ClientService clientService;

	@PostMapping("/save")
	public Client create(@RequestBody Client client) {
		return clientService.create(client);
	}

	@GetMapping("/get-by-id/{id}")
	public Client getById(@PathVariable long id) {
		return clientService.getById(id);
	}

	@GetMapping("/get-by-email")
	public Client getByEmail(@RequestParam String email) {
		return clientService.getByEmail(email);
	}

	@GetMapping("/get-all")
	public List<Client> getAll() {
		return clientService.getAll();
	}

	@PatchMapping("/update-name-by-id")
	public Client updateNameById(@RequestParam String name, @RequestParam long id) {
		return clientService.updateNameById(name, id);
	}

	@PatchMapping("/update-email-by-id")
	public Client updateEmailById(@RequestParam String email, @RequestParam long id) {
		return clientService.updateEmailById(email, id);
	}

	@DeleteMapping("/delete-by-id/{id}")
	public void deleteById(@PathVariable long id) {
		clientService.deleteById(id);
	}

}
