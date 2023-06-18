package org.student.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.model.User;
import org.student.three.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	public User create(User user) {
		return userRepository.save(user);
	}
	
	public List<User> findByFirstName(String firstName) {
		return userRepository.findByFirstName(firstName);
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User updateByEmail(String email, String fatherName) {
		User user = userRepository.findByEmail(email);
		if (user != null) {
			user.setFatherName(fatherName);
			user = userRepository.save(user);
		}
		return user;
	}
	
	public void deleteById(long id) {
		User user = userRepository.getReferenceById(id);
		if (user != null) {
			userRepository.delete(user);
		}
	}
}
