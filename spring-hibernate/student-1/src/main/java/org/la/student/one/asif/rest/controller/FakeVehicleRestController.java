package org.la.student.one.asif.rest.controller;

import org.la.student.one.asif.service.FakeVehicleI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fakevehicle")
public class FakeVehicleRestController {

	@Autowired
	@Qualifier("kia")
	private FakeVehicleI fakeVehicle;
	
	@GetMapping("/name")
	public String findCar() {
		return fakeVehicle.name();
	}
}
