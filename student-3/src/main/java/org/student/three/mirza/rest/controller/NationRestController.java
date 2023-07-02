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
	import org.student.three.mirza.modal.Nation;
	import org.student.three.mirzaa.service.NationService;


	@RestController
	@RequestMapping("/Nation")
	public class NationRestController {

		@Autowired
		private NationService   nationService;
		
		List<Nation> nationList = new ArrayList<>();
		
		@DeleteMapping("/delete-by-id/{id}")
		public void deleteById(@PathVariable long id) {
			nationService.deleteById(id); 
		}
		
		@PutMapping("/update-continent-name-by-name/{name}")
		public Nation updateByName(@PathVariable String name, @RequestParam String continentName) {
			return nationService.updateByContinentName(name, continentName);
		}
		
		@GetMapping("/find_by_code/{code}")
		public Nation findByCode(@PathVariable long code) {
			return nationService.findByCode(code);
		}
		
		@GetMapping("/find-by-name")
		List<Nation> findByName(@RequestParam String name) {
			return nationService.findByName(name);
		}
		
		@PostMapping("/add")
		public Nation add(@RequestBody Nation nation) {
			System.out.println(nation);
			nationList.add(nation);
			return nation;
		}
		
		@PostMapping("/creates")
		public Nation create(@RequestBody  Nation  nation) {
			return nationService.create(nation);
		}
		
		@GetMapping("/get/all")
		public List<Nation> getAll() {
			return nationService.getAll();
		}
		
		@GetMapping("/get")
		public List<Nation> get() {
			return nationList;
		}
		
		@GetMapping("/get/{id}")
		public Nation findId(@PathVariable long id) {
			List<Nation> collect = nationList.stream().filter(nation -> nation.getCode()==id).collect(Collectors.toList());
			return collect.get(0);
		}
	}
	



