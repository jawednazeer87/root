package org.student.three.mirzaa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Teacher;
import org.student.three.mirza.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	public TeacherRepository teacherRepository;
	
	public List<Teacher> getAll(){
		return teacherRepository.findAll();
		}
	
	public Teacher create(Teacher teacher) {
		return teacherRepository.save(teacher);
	}
	
	
	public Teacher findByEmail (String email) {
	
	return teacherRepository.findByEmail(email);
	}
	
	public Teacher updateByEmail(String email, String name) {
		
	Teacher teacher =  teacherRepository.findByEmail(email);
		if (teacher != null) {
			teacher.setName(name);
			teacher = teacherRepository.save(teacher);
		}
		return teacher;
	}
		public void deleteById(long id) {
			
			Teacher teacher = teacherRepository.getReferenceById(id);
			if (teacher != null) {
			teacherRepository.delete(teacher);
			
			}
		}
			public List<Teacher> findByFatherName(String fatherName){
				
				
				return teacherRepository.findByFatherName(fatherName);
			}
			}

