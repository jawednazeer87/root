package org.la.core.java.student.moshin.assignment10;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new Elementory();
        school.name("S.D.A School");
        System.out.println("school.address() = " + school.address());
        school.numStudents(450);

        school = new MiddleSchool();
        school.name("S.D.A Middle School");
        System.out.println("school.address() = " + school.address());
        school.numStudents(100);

        school = new HighSchool();
        school.name("S.D.A High School");
        System.out.println("school.address() = " + school.address());
        school.numStudents(1000);
    }
}
