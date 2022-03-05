package org.la.core.java.jawed.util;

import org.la.core.java.jawed.model.Student;
import org.la.core.java.jawed.model.dto.StudentDTO;

/**
 * @author jawednazeer
 */
public class StudentUtil {

	//manual copying member variables value
	public static Student userDTOToUser(StudentDTO studentDTO) {
		Student student = new Student();
		student.setId(studentDTO.getId());
		student.setAge(studentDTO.getAge());
		student.setRoll(studentDTO.getRoll());
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setSchool(studentDTO.getSchool());
		student.setStandard(studentDTO.getStandard());
		student.setWeight(studentDTO.getWeight());
		return student;
	}
}
