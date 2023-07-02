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
	import org.student.three.mirza.modal.Teacher;
	import org.student.three.mirzaa.service.TeacherService;


	@RestController
	@RequestMapping("/Teacher")
	public class TeacherRestController {

		@Autowired
		private TeacherService teacherService;
		
		List<Teacher> teacherList = new ArrayList<>();
		
		@DeleteMapping("/delete-by-id/{id}")
		public void deleteById(@PathVariable long id) {
			teacherService.deleteById(id); 
		}
		
		@PutMapping("/update-father-name-by-email/{email}")
		public Teacher updateByEmail(@PathVariable String email, @RequestParam String fatherName) {
			return teacherService.updateByEmail(email, fatherName);
		}
		
		@GetMapping("/find_by_email/{email}")
		public Teacher findByEmail(@PathVariable String email) {
			return teacherService.findByEmail(email);
		}
		
		@GetMapping("/find-by-first-name")
		List<Teacher> findByFatherName(@RequestParam String fatherName) {
			return teacherService.findByFatherName(fatherName);
		}
		
		@PostMapping("/add")
		public Teacher add(@RequestBody Teacher teacher) {
			System.out.println(teacher);
			teacherList.add(teacher);
			return teacher;
		}
		
		@PostMapping("/create")
		public Teacher create(@RequestBody Teacher teacher) {
			return teacherService.create(teacher);
		}
		
		@GetMapping("/get/all")
		public List<Teacher> getAll() {
			return teacherService.getAll();
		}
		
		@GetMapping("/get")
		public List<Teacher> get() {
			return teacherList;
		}
		
		@GetMapping("/get/{id}")
		public Teacher findId(@PathVariable int id) {
			List<Teacher> collect = teacherList.stream().filter(teacher -> teacher.getId()==id).collect(Collectors.toList());
			return collect.get(0);
		}
	}





