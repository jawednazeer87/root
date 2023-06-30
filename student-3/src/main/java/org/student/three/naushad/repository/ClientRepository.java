package org.student.three.naushad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.student.three.naushad.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	Client getByEmail(String email);
}
