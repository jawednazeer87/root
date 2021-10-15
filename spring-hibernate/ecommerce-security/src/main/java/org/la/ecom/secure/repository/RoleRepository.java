package org.la.ecom.secure.repository;

import org.la.ecom.secure.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	Role findByRole(String role);

}