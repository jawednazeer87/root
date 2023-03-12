package org.jn.core.java.student.naushad.jdbc.service;

import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneDto;
import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneRouteDomesticDto;
import org.jn.core.java.student.naushad.jdbc.repository.AeroplaneRouteDomesticRepository;

public class AeroplaneRouteDomesticService {
	AeroplaneRouteDomesticRepository aeroplaneRouteDomesticRepository = new AeroplaneRouteDomesticRepository();

	public void create(AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto) {
		aeroplaneRouteDomesticRepository.create(aeroplaneRouteDomesticDto);
	}

	public void update(AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto) {
		aeroplaneRouteDomesticRepository.update(aeroplaneRouteDomesticDto);
	}

	public void delete(int id) {
		aeroplaneRouteDomesticRepository.delete(id);
	}

	public AeroplaneRouteDomesticDto readById(int id) {
		return aeroplaneRouteDomesticRepository.readById(id);
	}

	public List<AeroplaneRouteDomesticDto> readAll() {
		return aeroplaneRouteDomesticRepository.readAll();
	}

	public List<AeroplaneRouteDomesticDto> readByRouteName(String route_name) {
		return aeroplaneRouteDomesticRepository.readByRouteName(route_name);
	}

}
