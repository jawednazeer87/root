package org.la.att.system.service;

import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.la.att.system.dto.UserDTO;
import org.la.att.system.model.User;
import org.la.att.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	public User addUser(UserDTO userDTO, String roleName) {
		
		User user = dozerBeanMapper.map(userDTO, User.class);
		user.setPassword(userDTO.getPasswordUser());
		
		
		String fullName = userDTO.getFullName();
		
		int index = fullName.lastIndexOf(' ');
		String lastName = fullName.substring(index + 1);
		
		
		if(lastName.equalsIgnoreCase(user.getLastName())) {
			user.setFirstName(fullName.substring(0, index));
		}
		else {
			user.setFirstName(fullName);
		}
		user = customUserDetailsService.addUser(user, roleName);
		
		return user;
    }
	


	public User update(User user) {
		return userRepository.save(user);
	}



	public User findByEmail(String email) {
		
		Optional<User> user = userRepository.findByEmail(email);
		
		if (user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
	
	
	
	public User findById(long id) {
		
		Optional<User> optional = userRepository.findById(id);
		
		if(optional.isPresent()) {
			
			User user = optional.get();
			
			return user;
		}
		
		return null;
	}
	
	
	
}
