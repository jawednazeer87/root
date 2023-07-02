package org.student.three.mirza.rest.controller;

import java.util.ArrayList;
import java.util.List;

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
import org.student.three.mirza.modal.Aeroplanes;
import org.student.three.mirza.repository.AeroplanesRepository;
import org.student.three.mirzaa.service.AeroplaneServices;


@RestController
@RequestMapping ("/aeroplanes" )
public class AeroplanesRestController {
	
	@Autowired
	private AeroplaneServices aeroplaneServices;
	
	List<Aeroplanes> aeroplanesList = new ArrayList<>();
	
	@DeleteMapping("d/delete-by-id/{id}")
	
	// public void deleteById(@PathVariable long id) {
	
	//return aeroplaneService.deleteById(id);
	//}
	
	@PutMapping("p/update-company-name-by-name/{name}")
	public Aeroplanes updateByName(@PathVariable String name , @RequestParam String modelName) {
		return  aeroplaneServices.updateByName(name, modelName);
	}
	
	@GetMapping("g/find_by_model_name/{modelName}")
	public Aeroplanes findByModelName(@PathVariable String model) {
		return aeroplaneServices.findByModel(model);
	}
	
	@GetMapping("/find-by-name")
	List<Aeroplanes> findByName(@RequestParam String name) {
		return aeroplaneServices.findByName(name);
	}
	
	@PostMapping("/add")
	public Aeroplanes add(@RequestBody Aeroplanes aeroplanes) {
		System.out.println(aeroplanes);
		aeroplanesList.add(aeroplanes);
		return aeroplanes;
	}
	
	@PostMapping("c/create")
	public Aeroplanes create(@RequestBody Aeroplanes aeroplanes) {
		return aeroplaneServices.create(aeroplanes);
	}
	
	@GetMapping("ga/get/all")               
	public List<Aeroplanes> getAll() {
		return aeroplaneServices.getAll();
	}
	
	@GetMapping("g/get")
	public List<Aeroplanes> get() {
		return aeroplanesList;
	}
	
//	@GetMapping("/get/{id}")
//	public Aeroplanes findId(@PathVariable int id) {
//	List<Aeroplanes> collect = aeroplanesList.stream().filter(aeroplanes -> aeroplanes.getId()==id).collect(Collectors.toList());
//		return collect.get(0);
//	}
}


	
		










