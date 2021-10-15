package org.la.ecom.secure.service;

import org.la.ecom.secure.model.Role;
import org.la.ecom.secure.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public Role findByRole(String roleName) {
		return roleRepository.findByRole(roleName);
	}
}