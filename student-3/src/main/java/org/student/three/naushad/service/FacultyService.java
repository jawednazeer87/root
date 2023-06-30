package org.student.three.naushad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.naushad.model.Faculty;
import org.student.three.naushad.repository.FacultyRepository;

@Service
public class FacultyService {

	@Autowired
	private FacultyRepository facultyRepository;

	public Faculty create(Faculty faculty) {
		return facultyRepository.save(faculty);
	}

	public List<Faculty> getAll() {
		return facultyRepository.findAll();
	}

	public Faculty getById(long id) {
		Optional<Faculty> facultyOptional = facultyRepository.findById(id);
		if (facultyOptional.isPresent()) {
			return facultyOptional.get();
		}
		return null;
	}

	public Faculty updateNameById(String name, long id) {
		Faculty faculty = getById(id);
		if (faculty != null) {
			faculty.setName(name);
			return facultyRepository.save(faculty);
		}
		return faculty;
	}

	public String deleteById(long id) {
		Faculty faculty = getById(id);
		if (faculty != null) {
			facultyRepository.delete(faculty);
			return "deleted";
		}
		return "not found";
	}
}
