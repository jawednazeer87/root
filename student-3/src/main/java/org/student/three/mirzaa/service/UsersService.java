package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Users;
import org.student.three.mirza.repository.UsersRepository;


@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List<Users> getAll() {
		return usersRepository.findAll(); //
	}
	
	public Users create(Users users) {
		return usersRepository.save(users);
	}
	

	
	public Users findByEmail (String email) {
		return  usersRepository.findByEmail (email);
	}

   public Users updateByEmail(String email, String firstName) {
		Users users =  usersRepository.findByEmail(email);
		if (users != null) {
			users.setFirstName(firstName);
			users = usersRepository.save(users);
		}
		return users;
	}
	
	public void deleteById(long id) {
		Users users = usersRepository.getReferenceById(id);
		if (users != null) {
			usersRepository.delete(users);
		}
	}

	public List<Users> findByFirstName(String firstName){
		
		
		return usersRepository.findByFirstName(firstName);
	}

	}


