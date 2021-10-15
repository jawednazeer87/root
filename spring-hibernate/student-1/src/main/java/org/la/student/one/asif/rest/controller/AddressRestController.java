package org.la.student.one.asif.rest.controller;

import java.util.List;

import org.la.student.one.asif.model.Address;
import org.la.student.one.asif.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressRestController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/findAll")
	public List<Address> findAll(){
		return addressService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Address findById(@PathVariable("id") long id) {
		return addressService.findById(id);
	}
	
	@GetMapping("/findByCity/{city}")
	public List<Address> findByCity(@PathVariable("city") String city){
		return addressService.findByCity(city);
	}
	
	@PostMapping("/create")
	public Address create(@RequestBody Address address) {
		return addressService.create(address);
	}
	
	@PostMapping("/update")
	public Address update(@RequestBody Address address) {
		return addressService.update(address);
	}
}
