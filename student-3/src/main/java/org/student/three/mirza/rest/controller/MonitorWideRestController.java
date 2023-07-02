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
import org.student.three.mirza.modal.MonitorWide;
import org.student.three.mirzaa.service.MonitorWideService;

@RestController
@RequestMapping ("monwide")
public class MonitorWideRestController {

	
	@Autowired
	MonitorWideService   monitorWideService;
	
	private List<MonitorWide> moniList = new ArrayList <>();
	
	@DeleteMapping ("/delete-by-id/{id}")
	public void deleteById(@PathVariable long id) {
		monitorWideService.deleteById(id);
	}
	@PutMapping ("/update-org-name-by-model-no/{modelNo}")
	public MonitorWide  updateByModelNo(@PathVariable String modelNo, @RequestParam String orgName) {
		return monitorWideService.updateByModelNo(modelNo, orgName);
	}
	@GetMapping("/find-by-model-no/{modelNo}")
	public MonitorWide findByModelNo(@PathVariable String modelNo) {
		return monitorWideService.findByModelNo(modelNo);
	}
	@GetMapping("/find-by-org-name")
	public List <MonitorWide> findByOrgName (@RequestParam String orgName){
		return monitorWideService.findByOrgName(orgName);
	}
	@PostMapping("/add")
	public MonitorWide add(@RequestBody MonitorWide monitorWide) {
		System.out.println(monitorWide);
		moniList.add(monitorWide);
		return monitorWide;
	}
	
	@PostMapping("/create")
	public MonitorWide create(@RequestBody MonitorWide monitorWide) {
		return monitorWideService.create(monitorWide);
	}
	
	@GetMapping("/get/all")               
	public List<MonitorWide> getAll() {
		return monitorWideService.getAll();
	}
	
	@GetMapping("/get")
	public List<MonitorWide> get() {
		return moniList;
	}
	
	@GetMapping("/get/{id}")
	public MonitorWide findId(@PathVariable int id) {
		List<MonitorWide> collect =moniList.stream().filter(monitorWide -> monitorWide.getId()==id).collect(Collectors.toList());
		return collect.get(0);
	}
}


