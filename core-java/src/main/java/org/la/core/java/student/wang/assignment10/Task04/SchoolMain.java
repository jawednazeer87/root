package org.la.core.java.student.wang.assignment10.Task04;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new Elementory();
        school.name("Alhambra Elementory School");
        System.out.println("school.address() = " + school.address());
        school.numStudents(450);

        school = new MiddleSchool();
        school.name("Alhambra Middle School");
        System.out.println("school.address() = " + school.address());
        school.numStudents(100);

        school = new HighSchool();
        school.name("Alhambra High School");
        System.out.println("school.address() = " + school.address());
        school.numStudents(1000);
    }
}
