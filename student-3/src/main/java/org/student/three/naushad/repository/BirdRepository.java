package org.student.three.naushad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.student.three.naushad.model.Bird;


public interface BirdRepository extends JpaRepository<Bird, Long> {

}
