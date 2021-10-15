package org.la.ecom.msql.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.la.ecom.msql.model.User;
import org.la.ecom.msql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleService roleService;

	@Autowired
	private DozerBeanMapper dozerBeanMapper;

	public List<String> getAllEmailsToSend(int mailSent) {

		List<String> emailList = new ArrayList<>();

		List<User> userList = userRepository.findByMailSentStatus(mailSent);

		if (userList != null && !userList.isEmpty()) {
			userList.stream().forEach(user -> emailList.add(user.getEmail()));
		}

		return emailList;
	}

	public List<User> findByMailSentStatus(int mailSent) {

		List<User> userList = userRepository.findByMailSentStatus(mailSent);

		return userList;
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

	public Collection<User> findAllUsersExceptGivenEmail(String email) {
		return userRepository.findAllUsersExceptGivenEmail(email);
	}

	public User findById(long id) {

		Optional<User> optional = userRepository.findById(id);

		if (optional.isPresent()) {

			User user = optional.get();

			return user;
		}

		return null;
	}

	public void update(User user) {
		userRepository.saveAndFlush(user);
	}
}