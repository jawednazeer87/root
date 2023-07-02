package org.student.three.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.student.three.dto.ConsumeDTO;
import org.student.three.dto.ConsumerListDTO;

@RestController
@RequestMapping("/consume")
public class ConsumerRestController {

	@Autowired
	private RestTemplate rest;
	private String fixedURL = "https://reqres.in/api/";
	
	@GetMapping("/user/{type}/{number}")
	public ResponseEntity<ConsumeDTO> user(@PathVariable String type, @PathVariable String number) {
		ResponseEntity<ConsumeDTO> forEntity = rest.getForEntity(fixedURL+type+"/"+number, ConsumeDTO.class);
		return forEntity;
	}
	
	@GetMapping("/{type}")
	public ResponseEntity<ConsumerListDTO> userList(@PathVariable String type, @RequestParam String number) {
		ResponseEntity<ConsumerListDTO> forEntity = 
				rest.getForEntity(fixedURL+type+"?page="+number, ConsumerListDTO.class);
		ConsumerListDTO list = forEntity.getBody();
		return forEntity;
	}
}
