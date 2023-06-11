package org.student.three.rest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleRestController {

	Map<String, String> map = new HashMap<>();
	
	@GetMapping("/add")
	public Map<String, String> add(@RequestParam String key, @RequestParam String value) {
		map.put(key, value);
		return map;
	}
	
	@GetMapping("/get")
	public Map<String, String> get() {
		return map;
	}
	
	@GetMapping("/byname/{name}")
	public String findByName(@PathVariable String name) {
		return map.get(name);
	}
	
	@GetMapping("/create")
	public Map<String, String> exampleMap() {
		map.put("name", "atiq");
		map.put("email", "atiq@mail.com");
		map.put("id", "12345");
		map.put("designation", "senior");
		return map;
	}
	
}
