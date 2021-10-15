package org.la.ecom.secure.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.secure.model.Role;
import org.la.ecom.secure.model.User;
import org.la.ecom.secure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	
	@Autowired
	private RoleService roleService;
	
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
	
	public User editUser(UserDTO userDTO, String roleName) {
		
		int userId = userDTO.getId();
		User user = findById(userId);
		
		user.setMembershipNum(userDTO.getMembershipNum());
		
		String fullName = userDTO.getFullName();
		
		int index = fullName.lastIndexOf(' ');
		String lastName = fullName.substring(index + 1);
		
		
		if(lastName.equalsIgnoreCase(userDTO.getLastName())) {
			user.setFirstName(fullName.substring(0, index));
		}
		else {
			user.setFirstName(fullName);
		}
		
		String password = userDTO.getPasswordUser();
		
		if(password!=null) {
			password = password.trim();
			if(password.length()>0) {
				user.setPassword(password);
			}
		}
		
		user.setLastName(userDTO.getLastName());
		user.setDob(userDTO.getDob());
		user.setEmail(userDTO.getEmail());
		
		user.setActive(userDTO.getActive());
		
		user = customUserDetailsService.addUser(user, roleName);
		
		return user;
    }

	public User update(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	public User findByEmail(String email) {
		
		Optional<User> user = userRepository.findByEmail(email);
		
		if (user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
	public Collection<User> findAllUsersExceptGivenEmail(String email){
		return userRepository.findAllUsersExceptGivenEmail(email);
	}
	
	
	public User updateRoleById(long id, String roleName) {
		
		Optional<User> optional = userRepository.findById(id);
		
		if(optional.isPresent()) {
			
			User user = optional.get();
			
			Role role = roleService.findByRole(roleName);
			
			user.setRoles(new HashSet<>(Arrays.asList(role)));
			
			update(user);
			
			return user;
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
	
	public void deleteById(long id) {

		Optional<User> optional = userRepository.findById(id);
		
		if(optional.isPresent()) {
			
			User user = optional.get();
			
			//to avoid problem of foreign constraint
			user.setRoles(null);
		
			user = update(user);			//deleting relation of user with role
			
			userRepository.delete(user);
		}
	}
	
}