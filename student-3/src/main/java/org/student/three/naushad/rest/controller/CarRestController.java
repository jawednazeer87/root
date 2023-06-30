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
import org.student.three.naushad.model.Car;
import org.student.three.naushad.service.CarService;

@RestController
@RequestMapping("/car")
public class CarRestController {

	@Autowired
	private CarService carService;

	@PostMapping("/create")
	public Car Create(@RequestBody Car car) {
		return carService.Create(car);
	}

	@GetMapping("/get/all")
	public List<Car> getAll() {
		return carService.getAll();
	}

	@GetMapping("/find-by-company")
	public List<Car> findByCompany(@RequestParam String company) {
		return carService.findByCompany(company);
	}

	@GetMapping("/find-by-type/{type}")
	public List<Car> findByType(@PathVariable String type) {
		return carService.findByType(type);
	}

	@GetMapping("find-by-id/{id}")
	public Car findById(@PathVariable long id) {
		return carService.findById(id);
	}

	@PutMapping("/update-type-by-id/{id}")
	public Car updateTypeById(@RequestParam String type, @PathVariable long id) {
		return carService.updateTypeById(type, id);
	}

	@DeleteMapping("/delete-by-id/{id}")
	public void deleteById(@PathVariable long id) {
		carService.deleteById(id);
	}

}
