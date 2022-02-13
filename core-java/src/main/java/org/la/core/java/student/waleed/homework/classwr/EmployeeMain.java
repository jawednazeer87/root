package org.la.core.java.student.waleed.homework.classwr;

import java.time.LocalDate;

import org.la.core.java.student.waleed.homework.classwr.model.Employee;
import org.la.core.java.student.waleed.homework.classwr.model.Works;

/**
 * @author Waleed Rizq
 *
 * @date Jan 24, 2022
 */
public class EmployeeMain {

	
	public static void main(String[] args) {
		String d0= "2022-04-21";
		String d01= "2022-05-11";
		LocalDate  sdate0 = LocalDate.parse(d0);
		LocalDate  sdate1 = LocalDate.parse(d01);
		Works  works1 = new Works ("IT department", "14 Hours",sdate0 );
		Works  works2 = new Works ("Administration ", "8 Hours",sdate1);
		Employee employee1 = new Employee();
		String d1= "2000-11-21";
		String d2= "2001-12-27";
		LocalDate  dob1 = LocalDate.parse(d1);
		LocalDate  dob2 = LocalDate.parse(d2);
		employee1.setName("Majid");
		employee1.setSsn(1000191);
		employee1.setBDate(dob1);
		employee1.setAddress(" 95304 AL Rahmah Street, Madinah");
		employee1.setGender('M');
		employee1.setSalary(7552.37);
		employee1.setWorks(works1);
		employee1.print();
		Employee employee2 = new Employee("Ahmed",100021,dob2,"0058 Takhwa, Rahmaat",'M',11900.55,works2);
		employee2.print();
	}

}
