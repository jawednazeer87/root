package org.la.att.system.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.la.att.system.model.CustomUserDetails;
import org.la.att.system.model.Role;
import org.la.att.system.model.User;
import org.la.att.system.repository.RoleRepository;
import org.la.att.system.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	private final Logger log = LoggerFactory.getLogger(CustomUserDetailsService.class);
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	

    @Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Optional<User> userOptional = userRepository.findByEmail(email);
		User user = userOptional.orElseThrow(() -> new UsernameNotFoundException("Not found: "+email));
		return new CustomUserDetails(user);
		
	}
  
	public User saveUser(User user, Set<Role> role) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(true);
        user.setRoles(role);
        return userRepository.save(user);
    }
	
	public User addUser(User user, String roleName) {
        
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        
		Role role = roleRepository.findByRole(roleName);
        user.setRoles(new HashSet<>(Arrays.asList(role)));
        
        return userRepository.save(user);
    }
	
	public User saveUser(User user, String roleName) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(true);
        Role role = roleRepository.findByRole(roleName);
        user.setRoles(new HashSet<>(Arrays.asList(role)));
        return userRepository.save(user);
    }
	
	public User findByEmail(String email) {
		
		Optional<User> user = userRepository.findByEmail(email);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
}