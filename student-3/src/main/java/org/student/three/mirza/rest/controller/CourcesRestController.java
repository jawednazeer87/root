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
import org.student.three.mirza.modal.Cources;
import org.student.three.mirzaa.service.CourcesService;

@RestController
@RequestMapping(name= "/c")
public class CourcesRestController {
	
	@Autowired
	private CourcesService courcesService ;
	
	public List<Cources> cList = new ArrayList<>();
	
	@DeleteMapping("/delete-by-id/{id}")
	public void deleteById(@PathVariable long id) {
		courcesService.deleteById(id);
	}
	@PutMapping("/update-name-by-institute-name/{instituteName}")
    public Cources updateByInstituteName(@PathVariable String instituteName, @RequestParam String name) {
		return courcesService.updateByInstituteName(instituteName, name);
		
	}
	@GetMapping("/find-by-institute-name/{instituteName}")
	public Cources findByInstituteName (@PathVariable String instituteName) {
		
		return courcesService.findByInstituteName(instituteName);
		
	}
	@GetMapping("/find-by-name")
	public List <Cources>findByName(@RequestParam String name){
		
		return courcesService.findByName(name);
	}
	@PostMapping("/add")
	public Cources add(@RequestBody Cources cources) {
		System.out.println(cources);
		cList.add(cources);
		return cources;
	}
	
	@PostMapping("/create")
	public Cources create(@RequestBody Cources cources) {
		return courcesService.create(cources);
	}
	
	@GetMapping("/get/all")               
	public List<Cources> getAll() {
		return courcesService.getAll();
	}
	
	@GetMapping("/get")
	public List<Cources> get() {
		return cList;
	}
	
	@GetMapping("/get/{id}")
	public Cources findId(@PathVariable int id) {
		List<Cources> collect = cList.stream().filter(cources -> cources.getId()==id).collect(Collectors.toList());
		return collect.get(0);
	}
}


