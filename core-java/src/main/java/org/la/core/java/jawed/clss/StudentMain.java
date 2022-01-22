/**
 * 
 */
package org.la.core.java.jawed.clss;

/**
 * @author jawednazeer
 *
 */
public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.roll = 1;
		student1.name = "amir";
		student1.print();
		
		Student student2 = new Student();
		student2.roll = 2;
		student2.name = "samir";
		student2.print();
		student1.print();
	}
}
