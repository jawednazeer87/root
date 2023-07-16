package org.student.three.mirza.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.student.three.dto.ConsumerListDTO;
import org.student.three.mirza.modal.ConsumeModel;

@RestController
@RequestMapping("consumes")
public class ConsumesRestController {

	@Autowired
	private RestTemplate rest;
	public String fixedURL ="https://api.publicapis.org/entries";
	
	@GetMapping ("/user/list")
	
	public ResponseEntity<ConsumeModel> user(@PathVariable String type, @PathVariable String number) {
		ResponseEntity<ConsumeModel> forEntity = rest.getForEntity(fixedURL+type+"/"+number, ConsumeModel.class);
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

	

