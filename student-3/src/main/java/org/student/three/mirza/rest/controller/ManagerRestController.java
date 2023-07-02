package org.student.three.mirza.rest.controller;

import java.util.ArrayList;
import java.util.Date;
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
import org.student.three.mirza.modal.Manager;
import org.student.three.mirzaa.service.ManagerService;

@RestController
@RequestMapping ("/manager")
public class ManagerRestController {
	
	@Autowired
	ManagerService managerService ;
	
	public List <Manager> managerList = new ArrayList<>();
	
	@DeleteMapping ("/delate-by-id/{id}")
    public void delateById(@PathVariable long id) {
		managerService.deleteById(id);
	}
	@PutMapping ("/update-dob-by-email/{email}")
	public Manager updateByEmail(@PathVariable String email, @RequestParam Date dob) {
		return managerService.updateByEmail(email, dob);
	}
	@GetMapping ("/find-by-email/{email}")
	public Manager findByEmail(@PathVariable String email) {
		return managerService.findByEmil(email);
	
	}
	@GetMapping ("/find-by-name")
	public List <Manager> findByName(@RequestParam String name) {
		
		return managerService.findByName(name);
		
	}
	@PostMapping("/add")
	public Manager add(@RequestBody Manager manager) {
		System.out.println(manager);
		managerList.add(manager);
		return manager;
		
	}
	@PostMapping ("/create")
	public Manager create(@RequestBody Manager mananer) {
		return managerService.create(mananer);
	}
	
	@GetMapping("/get/all")
	public List<Manager> getAll(){
		return managerService.getAll();
	}

	@GetMapping("/get")
	public List<Manager> get(){
		return managerList;
	
	}
	
	@GetMapping("/get/{id}")
	public Manager findId(@PathVariable int id) {
		List<Manager> collect = managerList.stream().filter(manager -> manager.getId()==id).collect(Collectors.toList());
		return collect.get(0);
	}
}



 