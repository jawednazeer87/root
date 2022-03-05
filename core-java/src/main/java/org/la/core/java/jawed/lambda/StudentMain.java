/**
 * 
 */
package org.la.core.java.jawed.lambda;

import java.util.List;
import java.util.stream.Collectors;

import org.la.core.java.jawed.common.Constants;
import org.la.core.java.jawed.model.Student;
import org.la.core.java.jawed.model.dto.StudentDTO;
import org.la.core.java.jawed.util.GSONGenericUtil;
import org.la.core.java.jawed.util.GenericUtil;
import org.la.core.java.jawed.util.StudentUtil;

import com.google.gson.Gson;

/**
 * @author jawednazeer
 *
 */
public class StudentMain {
	public static void main(String[] args) {
		//conversionManual();
		//conversionByGSON();
		//filterByStream();
		//processStreamMap();
		//processStreamFilterMap();
		//conversionManual();
		//conversionByGSON();
		conversionByGSONGeneric();
	}
	
	//map using stream
	static void processStreamFilterMapMethodReference() {
		List<Student> list = GSONGenericUtil.getList(Constants.STUDENT_LIST_FILE_NAME, Student[].class);
		List<Integer> ageList = list.stream().filter(std-> std.getAge()<=14).map(Student::getAge).collect(Collectors.toList());
		GenericUtil.print(ageList);
	}
	
	//map using stream
	static void processStreamFilterMap() {
		List<Student> list = GSONGenericUtil.getList(Constants.STUDENT_LIST_FILE_NAME, Student[].class);
		List<Integer> ageList = list.stream().filter(std-> std.getAge()<=14).map(std-> std.getAge()).collect(Collectors.toList());
		GenericUtil.print(ageList);
	}
	
	//map using stream
	static void processStreamMap() {
		List<Student> list = GSONGenericUtil.getList(Constants.STUDENT_LIST_FILE_NAME, Student[].class);
		List<Integer> ageList = list.stream().map(std-> std.getAge()).collect(Collectors.toList());
		GenericUtil.print(ageList);
	}
	//filter using stream api
	static void filterByStream() {
		List<Student> list = GSONGenericUtil.getList(Constants.STUDENT_LIST_FILE_NAME, Student[].class);
		List<Student> ageList = list.stream().filter(std-> std.getAge()>15).collect(Collectors.toList());
		GenericUtil.print(ageList);
	}
	
	//reading json from files and converting to java object
	public static Student jsonToObject() {
		Student student = GSONGenericUtil.jsonToObject(Constants.STUDENT_FILE_NAME, Student.class);
		System.out.println("main: "+student);
		return student;
	}
	
	//reading json from files and converting to java list object
	public static void jsonToListObject() {
		List<Student> list = GSONGenericUtil.getList(Constants.STUDENT_LIST_FILE_NAME, Student[].class);
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
		System.out.println("json: "+json);
		Student student = gson.fromJson(json, Student.class); 
		System.out.println("by gson: "+student);
	}
	//using gson data conversion from User to UserDTO using generic
	public static void conversionByGSONGeneric() {
		StudentDTO studentDTO = GSONGenericUtil.jsonToObject(Constants.STUDENT_FILE_NAME, StudentDTO.class);
		Student student = GSONGenericUtil.map(studentDTO, Student.class); 
		System.out.println("by gson: "+student);
	}
}
