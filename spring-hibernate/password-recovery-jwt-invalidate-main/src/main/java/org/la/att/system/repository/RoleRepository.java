package org.la.att.system.repository;

import org.la.att.system.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	Role findByRole(String role);

}
