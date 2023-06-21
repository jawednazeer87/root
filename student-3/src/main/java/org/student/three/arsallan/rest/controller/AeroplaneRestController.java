package org.student.three.arsallan.rest.controller;

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
import org.student.three.arsallan.service.AeroplaneService;
import org.student.three.arsallan.model.Aeroplane;

@RestController
@RequestMapping("/aeroplane")
public class AeroplaneRestController {

	@Autowired
	private AeroplaneService aeroplaneService;
	
	public List<Aeroplane> aeroplaneList = new ArrayList<>();
	
	@GetMapping("/get/all")
	public List<Aeroplane> getAll(){
		return aeroplaneService.getAll();
	}
	
	@GetMapping("/find-by-model")
	List<Aeroplane> findByModel(@RequestParam String model){
		return aeroplaneService.findByModel(model);
	}
	
	@DeleteMapping("/delete-by-id/{id}")
	public void deleteByid(@PathVariable long id) {
		aeroplaneService.deleteById(id);
	}
	
	@PostMapping("/create")
	public Aeroplane create(@RequestBody Aeroplane aeroplane) {
		return aeroplaneService.create(aeroplane);
	}
	
	@PutMapping("/update-model/speed")
	public List<Aeroplane> update(@RequestParam String model,@RequestParam int speed){
		return aeroplaneService.updateSpeed(model, speed);
	}
}
