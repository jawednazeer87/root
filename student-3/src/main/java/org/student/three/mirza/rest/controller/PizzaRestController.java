
	
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
	import org.student.three.mirza.modal.Pizza;
	import org.student.three.mirzaa.service.PizzaService;
	



	@RestController
	@RequestMapping("/pizza")
	public class PizzaRestController {

		@Autowired
		private PizzaService  pizzaService;
		
		List<Pizza> pizzaList = new ArrayList<>();
		
		@DeleteMapping("/delete-by-id/{id}")
		public void deleteById(@PathVariable long id) {
			pizzaService.deleteById(id); 
		}
		
		@PutMapping("/update-name-by-type/{type}")
		public Pizza updateByType(@PathVariable String type, @RequestParam String name) {
			return pizzaService.updateByType(type, name);
		}
		
		@GetMapping("/find_by_name/{name}")
		public List<Pizza> findByName(@PathVariable String name) {
			return pizzaService.findByName(name);
		}
		
		@GetMapping("/find-by-created-date")
		List<Pizza> findByCreatedDate(@RequestParam Date createdDate) {
			return pizzaService.findByCreatedDate(createdDate);
		}
		
		@PostMapping("/add")
		public Pizza add(@RequestBody Pizza pizza) {
			System.out.println(pizza);
			pizzaList.add(pizza);
			return pizza;
		}
		
		@PostMapping("/create")
		public Pizza create(@RequestBody Pizza pizza) {
			return pizzaService.create(pizza);
		}
		
		@GetMapping("/get/all")
		public List<Pizza> getAll() {
			return pizzaService.getAll();
		}
		
		@GetMapping("/get")
		public List<Pizza> get() {
			return pizzaList;
		}
		
		@GetMapping("/get/{id}")
		public Pizza findId(@PathVariable int id) {
			List<Pizza> collect = pizzaList.stream().filter(pizza -> pizza.getId()==id).collect(Collectors.toList());
			return collect.get(0);
		}
	}





