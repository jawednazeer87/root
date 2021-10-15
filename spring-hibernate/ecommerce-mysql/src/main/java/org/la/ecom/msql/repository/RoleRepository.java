package org.la.ecom.msql.repository;

import org.la.ecom.msql.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	Role findByRole(String role);

}