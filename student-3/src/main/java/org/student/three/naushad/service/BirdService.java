package org.student.three.naushad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.naushad.model.Bird;
import org.student.three.naushad.repository.BirdRepository;

@Service
public class BirdService {

	@Autowired
	private BirdRepository birdRepository;

	public Bird create(Bird bird) {
		return birdRepository.save(bird);
	}

	public Bird getById(long id) {
		Optional<Bird> bird = birdRepository.findById(id);
		if (bird.isPresent()) {
			return bird.get();
		}
		return null;
	}

	public List<Bird> getAll() {
		return birdRepository.findAll();
	}

	public Bird updateNameById(String name, long id) {
		Bird bird = getById(id);
		if (bird != null) {
			bird.setName(name);
			return birdRepository.save(bird);
		} else
			return bird;
	}

	public String deleteById(long id) {
		Bird bird = getById(id);
		if (bird != null) {
			birdRepository.delete(bird);
			return "Deleted successfully";
		} else
			return "Not Found";
	}

}
