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
        import org.student.three.mirzaa.service.ZooService;
        
        import org.student.three.mirza.modal.Zoo;
	

		@RestController
		@RequestMapping("/zoo")
		public class ZooRestController {

			@Autowired
			private ZooService zooService;
			
			List<Zoo> zooList = new ArrayList<>();
			
			@DeleteMapping("/delete-by-id/{id}")
			public void deleteById(@PathVariable long id) {
				zooService.deleteById(id); 
			}
			
			@PutMapping("/update-father-name-by-email/{email}")
			public Zoo updateByEmail(@PathVariable String email, @RequestParam String name) {
				return zooService.updateByEmailZooAuthority(email, name);
			}
			
			@GetMapping("/find_by_email/{email}")
			public Zoo findByEmailZooAuthority(@PathVariable String email) {
				return zooService.findByEmailZooAuthority(email);
			}
			
			@GetMapping("/find-by-first-name")
			List<Zoo> findByName(@RequestParam String name) {
				return zooService.findByName(name);
			}
			
			@PostMapping("/add")
			public Zoo add(@RequestBody Zoo zoo) {
				System.out.println(zoo);
				zooList.add(zoo);
				
				return zoo;
			}
			
			@PostMapping("/create")
			public Zoo create(@RequestBody Zoo zoo) {
				return zooService.create(zoo);
			}
			
			@GetMapping("/get/all")
			public List<Zoo> getAll() {
				return zooService.getAll();
			}
			
			@GetMapping("/get")
			public List<Zoo> get() {
				
				return zooList;
			}
			
			@GetMapping("/get/{id}")
			public Zoo findId(@PathVariable int id) {
				List<Zoo> collect = zooList.stream().filter(zoo -> zoo.getId()==id).collect(Collectors.toList());
				return collect.get(0);
			}
		


	}


