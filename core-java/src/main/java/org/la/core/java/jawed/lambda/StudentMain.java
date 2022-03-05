/**
 * 
 */
package org.la.core.java.jawed.lambda;

import java.util.List;

import org.la.core.java.jawed.common.Constants;
import org.la.core.java.jawed.model.Student;
import org.la.core.java.jawed.model.dto.StudentDTO;
import org.la.core.java.jawed.util.GSONGenericUtil;
import org.la.core.java.jawed.util.StudentUtil;

import com.google.gson.Gson;

/**
 * @author jawednazeer
 *
 */
public class StudentMain {
	public static void main(String[] args) {
		//conversionManual();
		conversionByGSON();
	}
	
	//reading json from files and converting to java object
	public static Student jsonToObject() {
		Student student = GSONGenericUtil.jsonToObject(Constants.STUDENT_FILE_NAME, Student.class);
		System.out.println("main: "+student);
		return student;
	}
	
	//reading json from files and converting to java list object
	public static void jsonToListObject() {
		List<Student> list = GSONGenericUtil.getList(Constants.STUDENT_LIST_FILE_NAME);
		System.out.println("list: "+list);
	}
	
	//manual data conversion from User to UserDTO
	public static void conversionManual() {
		StudentDTO studentDTO = GSONGenericUtil.jsonToObject(Constants.STUDENT_FILE_NAME, StudentDTO.class);
		Student student = StudentUtil.userDTOToUser(studentDTO);
		System.out.println("manual: "+student);
	}
	
	//using gson data conversion from User to UserDTO
	public static void conversionByGSON() {
		Gson gson = new Gson();
		StudentDTO studentDTO = GSONGenericUtil.jsonToObject(Constants.STUDENT_FILE_NAME, StudentDTO.class);
		String json = gson.toJson(studentDTO);
		Student student = gson.fromJson(json, Student.class); 
		System.out.println("by gson: "+student);
	}
}
