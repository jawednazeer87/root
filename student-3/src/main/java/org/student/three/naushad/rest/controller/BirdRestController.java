package org.student.three.naushad.rest.controller;

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
import org.student.three.naushad.model.Bird;
import org.student.three.naushad.service.BirdService;

@RestController
@RequestMapping("/bird")
public class BirdRestController {

	@Autowired
	private BirdService birdService;

	@PostMapping("/save")
	public Bird create(@RequestBody Bird bird) {
		return birdService.create(bird);
	}

	@GetMapping("/get-by-id/{id}")
	public Bird getById(@PathVariable long id) {
		return birdService.getById(id);
	}

	@GetMapping("/get-all")
	public List<Bird> getAll() {
		return birdService.getAll();
	}

	@PutMapping("/update-name-by-id/{id}")
	public Bird updateNameById(@RequestParam String name, @PathVariable long id) {
		return birdService.updateNameById(name, id);
	}

	@DeleteMapping("/delete-by-id/{id}")
	public String deleteById(@PathVariable long id) {
		return birdService.deleteById(id);
	}

}
