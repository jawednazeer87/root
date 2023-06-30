package org.student.three.naushad.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.student.three.naushad.model.Faculty;
import org.student.three.naushad.service.FacultyService;

@RestController
@RequestMapping("/faculty")
public class FacultyRestController {

	@Autowired
	private FacultyService facultyService;

	@PostMapping("/save")
	public Faculty create(@RequestBody Faculty faculty) {
		return facultyService.create(faculty);
	}

	@GetMapping("/get-all")
	public List<Faculty> getAll() {
		return facultyService.getAll();
	}

	@GetMapping("/get-by-id/{id}")
	public Faculty getById(@PathVariable long id) {
		return facultyService.getById(id);
	}

	@PatchMapping("/update-name-by-id/{id}")
	public Faculty updateNameById(@RequestParam String name, @PathVariable long id) {
		return facultyService.updateNameById(name, id);
	}

	@DeleteMapping("/delete-by-id/{id}")
	public String deleteById(@PathVariable long id) {
		return facultyService.deleteById(id);
	}

}
