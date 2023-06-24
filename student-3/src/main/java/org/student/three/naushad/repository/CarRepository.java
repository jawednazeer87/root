package org.student.three.naushad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.student.three.naushad.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

	List<Car> findByCompany(String company);

	List<Car> findByType(String type);
}
