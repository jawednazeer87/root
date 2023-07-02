package org.student.three.mirza.rest.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.student.three.mirza.modal.Client;

import org.student.three.mirzaa.service.ClientsService;

@RestController
@RequestMapping("/client")
public class ClientsRestController {

	
	
	 @Autowired
	 
	 ClientsService clientsService ;
	 
	 List<Client> clientsList = new ArrayList<>();
		
		@DeleteMapping("/delete-by-country/{country}")
		public void deleteByCountry(@PathVariable String country) {
			clientsService.deleteByCountry(country); 
		}
		
		@PutMapping("/update-name-by-email/{email}")
		public Client updateByEmail(@PathVariable String email, @RequestParam String name) {
			return clientsService.updateByEmail(email, name);
		}
		
		@GetMapping("/find_by_email/{email}")
		public Client findByEmail(@PathVariable String email) {
			return clientsService.findByEmail(email);
		}
		
		@GetMapping("/find-by-name")
		List<Client> findByName(@RequestParam String name) {
			return clientsService.findByName(name);
		}
		
		@PostMapping("/add")
		public Client add(@RequestBody Client client) {
			System.out.println(client);
			clientsList.add(client);
			return client;
		}
		
		@PostMapping("/create")
		public Client create(@RequestBody Client client) {
			return clientsService.create(client);
		}
		
		@GetMapping("/get/all")               
		public List<Client> getAll() {
			return  clientsService.getAll();
		}
		
		@GetMapping("/get")
		public List<Client> get() {
			return clientsList;
		}
		
		@GetMapping("/get/{id}")
		public Client findByEmail1(@PathVariable String email) {
			List<Client> collect = clientsList.stream().filter(client -> client.getEmail()==email).collect(Collectors.toList());
			return collect.get(0);
		}
	}



