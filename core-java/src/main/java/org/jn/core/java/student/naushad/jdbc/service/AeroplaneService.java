package org.jn.core.java.student.naushad.jdbc.service;

import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneDto;
import org.jn.core.java.student.naushad.jdbc.repository.AeroplaneRepository;

public class AeroplaneService {
	AeroplaneRepository aeroplaneRepository = new AeroplaneRepository();

	public void create(AeroplaneDto aeroplaneDto) {
		aeroplaneRepository.create(aeroplaneDto);
	}

	public void update(AeroplaneDto aeroplaneDto) {
		aeroplaneRepository.update(aeroplaneDto);
	}

	public void delete(int id) {
		aeroplaneRepository.delete(id);
	}

	public AeroplaneDto readById(int id) {
		return aeroplaneRepository.findById(id);
	}

	public List<AeroplaneDto> readAll() {
		return aeroplaneRepository.readAll();
	}

	public List<AeroplaneDto> readByCompany_name(String company_name) {
		return aeroplaneRepository.findByCompany_Name(company_name);
	}
}
