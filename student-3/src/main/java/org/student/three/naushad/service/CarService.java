package org.student.three.naushad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.naushad.model.Car;
import org.student.three.naushad.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public Car Create(Car car) {
		return carRepository.save(car);
	}

	public List<Car> getAll() {
		return carRepository.findAll();
	}

	public List<Car> findByCompany(String company) {
		return carRepository.findByCompany(company);
	}

	public List<Car> findByType(String type) {
		return carRepository.findByType(type);
	}

	public Car findById(long id) {
		Optional<Car> car = carRepository.findById(id);
		if (car.isPresent()) {
			return car.get();
		} else {
			return null;
		}
	}

	public Car updateTypeById(String type, long id) {
		Car car = findById(id);
		if (car != null) {
			car.setType(type);
			return carRepository.save(car);
		} else
			return null;
	}

	public void deleteById(long id) {
		Car car = carRepository.getReferenceById(id);
		if (car != null) {
			carRepository.delete(car);
		}
	}
}
