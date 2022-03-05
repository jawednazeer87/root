/**
 * 
 */
package org.la.core.java.jawed.lambda;

import java.util.List;

import org.la.core.java.jawed.common.Constants;
import org.la.core.java.jawed.model.Student;
import org.la.core.java.jawed.util.GSONGenericUtil;

/**
 * @author jawednazeer
 *
 */
public class StudentMain {
	public static void main(String[] args) {
		GSONGenericUtil<Student> gu = new GSONGenericUtil<>(Student.class);
		Student student = gu.jsonToObject(Constants.STUDENT_FILE_NAME);
		//System.out.println("main: "+student);
		List<Student> list = GSONGenericUtil.getList(Constants.STUDENT_LIST_FILE_NAME);
		System.out.println("list: "+list);
		//GenericUtil.print(list);
	}
}
