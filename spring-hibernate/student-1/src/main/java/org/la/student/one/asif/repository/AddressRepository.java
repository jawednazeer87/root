package org.la.student.one.asif.repository;

import java.util.List;

import org.la.student.one.asif.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>{

	public List<Address> findByCity(String name);
}
