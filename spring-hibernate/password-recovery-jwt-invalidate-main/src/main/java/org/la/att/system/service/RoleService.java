package org.la.att.system.service;

import org.la.att.system.model.Role;
import org.la.att.system.repository.RoleRepository;
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
