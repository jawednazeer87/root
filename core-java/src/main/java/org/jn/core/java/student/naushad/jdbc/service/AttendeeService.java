package org.jn.core.java.student.naushad.jdbc.service;

import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.dto.AttendeeDto;
import org.jn.core.java.student.naushad.jdbc.repository.AttendeeRepository;

public class AttendeeService {
	AttendeeRepository attendeeRepository = new AttendeeRepository();

	public void create(AttendeeDto attendeeDto) {
		attendeeRepository.create(attendeeDto);
	}

	public void update(AttendeeDto attendeeDto) {
		attendeeRepository.update(attendeeDto);
	}

	public void delete(int id) {
		attendeeRepository.delete(id);
	}

	public AttendeeDto findById(int id) {
		return attendeeRepository.findById(id);
	}

	public List<AttendeeDto> readAll() {
		return attendeeRepository.readAll();
	}

	public List<AttendeeDto> findByName(String name) {
		return attendeeRepository.findByName(name);
	}
}
