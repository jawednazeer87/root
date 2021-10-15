package org.la.ecom.secure.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.dozer.DozerBeanMapper;
import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.secure.exceptions.AlreadyExistsException;
import org.la.ecom.secure.model.CustomUserDetails;
import org.la.ecom.secure.model.Role;
import org.la.ecom.secure.model.User;
import org.la.ecom.secure.repository.RoleRepository;
import org.la.ecom.secure.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService{

	private final Logger log = LoggerFactory.getLogger(CustomUserDetailsService.class);
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private DozerBeanMapper dozerBeanMapper;

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
	
	public User addUser(User user) {
        
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
     
		Optional<Role> optionalRole = user.getRoles().stream().filter(role -> role.getRole().contains("ROLE")).findFirst();
		
		if(optionalRole.isPresent()) {
			Role role = optionalRole.get();
			role = roleRepository.findByRole(role.getRole());
			user.setRoles(new HashSet<>(Arrays.asList(role)));
		}
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
	
	public User addUser(UserDTO userDTO, String roleName) {
		
		String email = userDTO.getEmail();
		
		Optional<User> userOptional = userRepository.findByEmail(email);
		
		userOptional.ifPresent(user -> {throw new AlreadyExistsException("Email already exist");});
		
		User user = dozerBeanMapper.map(userDTO, User.class);
		
		user.setPassword(userDTO.getPasswordUser());
		
		user = addUser(user, roleName);
		
		return user;
    }
	
	public User addUser(UserDTO userDTO) {
		
		String email = userDTO.getEmail();
		
		Optional<User> userOptional = userRepository.findByEmail(email);
		
		userOptional.ifPresent(user -> {throw new AlreadyExistsException("Email already exist");});
		
		User user = dozerBeanMapper.map(userDTO, User.class);
		user.setMailSentStatus(1);
		user.setPassword(userDTO.getPasswordUser());
		
		user = addUser(user);
		
		return user;
    }

}